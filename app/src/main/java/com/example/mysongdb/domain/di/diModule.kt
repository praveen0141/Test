package com.example.mysongdb.domain.di

import com.example.mysongdb.data.network.NetworkInterface
import com.example.mysongdb.data.network.ShowsNetworkInterface
import com.example.mysongdb.data.repository.getEpisodesDataImpl
import com.example.mysongdb.data.repository.getShowsDataImpl
import com.example.mysongdb.domain.repository.getEpisodes
import com.example.mysongdb.domain.repository.getShows
import com.example.mysongdb.domain.usecase.episodeUseCase
import com.example.mysongdb.domain.usecase.showsUseCase
import com.example.mysongdb.presentation.HomeViewModel
import org.koin.core.module.Module
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
val di= module {
    single {
        Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.tvmaze.com/")
            .build()
            .create(NetworkInterface::class.java)
    }
    single {
        Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.tvmaze.com/")
            .build()
            .create(ShowsNetworkInterface::class.java)
    }
        single<getEpisodes>{
            getEpisodesDataImpl(get())
        }
    single<getShows>{
        getShowsDataImpl(get())
    }
        single {
            episodeUseCase(get())
        }
    single {
        showsUseCase(get())
    }
        viewModel {
            HomeViewModel(get())

        }

}