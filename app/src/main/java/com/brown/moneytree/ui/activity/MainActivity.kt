package com.brown.moneytree.ui.activity

import android.os.Bundle
import androidx.activity.compose.setContent
import com.brown.moneytree.base.BaseActivity
import com.brown.moneytree.ui.screen.Main
import com.brown.moneytree.ui.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Main()
            }
        }
    }
}
