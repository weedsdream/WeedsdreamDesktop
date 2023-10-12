package com.example.app_name

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class ActivityMain : ActivityBase() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StarSetTheme() {
                ActivityMainUi()
            }
        }
    }

    @Composable
    private fun ActivityMainUi() {
        Text(text = "Template!")
    }

}