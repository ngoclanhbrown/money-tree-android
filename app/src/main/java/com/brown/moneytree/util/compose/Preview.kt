package com.brown.moneytree.util.compose

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.brown.moneytree.ui.theme.AppTheme

@Composable
fun PreviewWithTheme(content: @Composable () -> Unit) {
    AppTheme {
        Surface {
            content()
        }
    }
}
