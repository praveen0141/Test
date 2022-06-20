package com.example.mysongdb.domain

sealed class Result<T>(var data:T?=null,var message:String?=null)
{
    class Loading<T>():Result<T>()
    class Success<T>(data: T?):Result<T>(data = data)
    class Error<T>(message: String?):Result<T>()
}
