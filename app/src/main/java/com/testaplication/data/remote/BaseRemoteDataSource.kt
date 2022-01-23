package com.testaplication.data.remote

import com.google.gson.Gson
import com.testaplication.util.Constants
import okhttp3.ResponseBody
import retrofit2.Response

abstract class BaseRemoteDataSource {

    suspend fun <T> getResult(call: suspend () -> Response<T>): Result<T> {

        try {
            val response = call()
            if(response.isSuccessful) {
                val body  = response.body()
                if(body != null) return Result.Success(body)
            } else {
                val errorBody = getErrorBody(response.errorBody())
                return error(errorBody?.message ?: Constants.GENERIC_ERROR)
            }
            return error(Constants.GENERIC_ERROR)
        } catch (e: Exception) {
            return error(e.message ?: e.toString())
        }

    }

    private fun error(message: String): Result.Error = Result.Error(message = message)

    private fun getErrorBody(errorBody: ResponseBody?): GenericResponse? {
        return try {
            Gson().fromJson(errorBody?.charStream(), GenericResponse::class.java)
        } catch (e: Exception) {
            null
        }
    }
}