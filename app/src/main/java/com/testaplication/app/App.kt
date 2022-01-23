package com.testaplication.app

import android.app.Application
import com.testaplication.di.appModule
import com.testaplication.di.dataModule
import com.testaplication.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    dataModule,
                    domainModule,
                    appModule
            )
            )
        }
    }
}