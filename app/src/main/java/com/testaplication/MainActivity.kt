package com.testaplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.testaplication.presentation.screens.main.MainScreen
import com.testaplication.presentation.screens.splash.SplashViewModel
import com.testaplication.ui.theme.TestAplicationTheme

class MainActivity : ComponentActivity() {

    private val viewModel: SplashViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition{
                viewModel.isLoading.value
            }
        }
        setContent {
            TestAplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MainScreen()
                }
            }
        }
    }
}
