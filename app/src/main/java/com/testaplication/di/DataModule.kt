package com.testaplication.di

import com.testaplication.data.local.MatchesDataBase
import com.testaplication.data.local.MatchesLocalRepositoryImpl
import com.testaplication.data.remote.Api
import com.testaplication.data.remote.MatchesRemoteRepositoryImpl
import com.testaplication.data.repository.MatchesLocalRepository
import com.testaplication.data.repository.MatchesRemoteRepository
import com.testaplication.data.repository.MatchesRepositoryImpl
import com.testaplication.domain.repository.MatchesRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val dataModule = module {

    single<MatchesLocalRepository> {
        MatchesLocalRepositoryImpl(database = get())
    }

    single<MatchesRemoteRepository> {
        MatchesRemoteRepositoryImpl(api = get())
    }

    single<MatchesRepository> {
        MatchesRepositoryImpl(local = get(), remote = get())
    }

    single { provideInterceptor() }

    single { provideOkHttpClient(loggingInterceptor = get()) }

    factory { provideRetrofit(okHttpClient = get()) }

    single { provideApi(retrofit = get()) }

    single { MatchesDataBase.getDataBase(context = get())}

}

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://app.sportdataapi.com/api/v1")
        .client(okHttpClient)
        .build()
}

fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
    return OkHttpClient.Builder()
        .addInterceptor(interceptor = loggingInterceptor)
        .connectTimeout(10, TimeUnit.SECONDS)
        .build()
}

fun provideInterceptor(): HttpLoggingInterceptor {
    return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
}

fun provideApi(retrofit: Retrofit): Api =
    retrofit.create(Api::class.java)
