package com.testaplication.data.remote

sealed class Result<out R> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val message: String) : Result<Nothing>()
    object Loading : Result<Nothing>()
}

val Result<*>.succeeded
    get() = this is Result.Success && data != null
