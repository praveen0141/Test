package com.example.mysongdb.presentation

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mysongdb.data.model.EpisodeResponse.EpisodeResponse
import com.example.mysongdb.data.model.ShowsResponse.ShowsResponse
import com.example.mysongdb.domain.usecase.episodeUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import com.example.mysongdb.domain.Result
import com.example.mysongdb.domain.usecase.showsUseCase
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect

class HomeViewModel(private val showsUseCase: showsUseCase) :ViewModel(){
    private val episodeDetails=MutableStateFlow(EpisodeResponse())

    val episodeDetailState=episodeDetails.asStateFlow()
    private val loadingState = mutableStateOf(false)
    val loading= loadingState

    //For Shows
    private val showDetails = MutableStateFlow(ShowResponseStatus())
    val showsDetailState = showDetails.asStateFlow()
    private val loadingStateShow = mutableStateOf(false)
    val loadingShow= loadingStateShow
    fun Showit(name:String) {
        viewModelScope.launch {
            showsUseCase.getShowsDetails(name = name).collect { result ->
                Log.d("final value of Show", result.toString())
                when (result) {
                    is Result.Success -> {
                        showDetails.value = showsDetailState.value.copy(result.data!!)
                        loadingState.value = false
                        Log.d("success", result.data.toString())
                    }
                    is Result.Loading -> {

                        loadingState.value = true
                    }
                    is Result.Error -> {
                        Log.d("result----", result.data.toString())
                    }
                }
            }
        }
    }
//    fun onClick(name:String)
//    {
//        viewModelScope.launch {
//            episodeUseCase.getEpisodeDetails(name = name).collect {
//                    result ->
//                Log.d("finalvalue",result.toString())
//                when(result){
//                    is Result.Success ->{
//                        episodeDetails.value=result.data!!
//                        loadingState.value=false
//                        Log.d("success",result.data.toString())
//                    }
//                    is Result.Loading->{
//
//                        loadingState.value=true
//                    }
//                    is Result.Error->{
//                        Log.d("result----",result.data.toString())
//                    }
//                }
//            }
//        }
//
//    }
    }