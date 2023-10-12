package com.example.app_name

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity

/**项目根Activity*/
open class ActivityBase : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //取消状态栏和导航栏占位
        window.setDecorFitsSystemWindows(false)
    }

    /**Activity配置变化回调：如横竖屏切换*/
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        val orientation = newConfig.orientation == Configuration.ORIENTATION_PORTRAIT
    }
}