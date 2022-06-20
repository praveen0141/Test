package com.example.mysongdb.presentation

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import org.koin.androidx.compose.getViewModel

@Composable
fun HomePage()
{
    val viewModel = getViewModel<HomeViewModel>()
    var finalList:ArrayList<ShowResponseStatus> = ArrayList<ShowResponseStatus>()

    Column() {
        viewModel.Showit("1")

        val x = viewModel.showsDetailState.collectAsState()
        x.value.showsResponse?.let {
            Text(text = it.name)
            finalList.add(x.value)

        }

    }





}