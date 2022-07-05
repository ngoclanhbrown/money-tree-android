package com.brown.moneytree.ui.screen.account

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.brown.moneytree.util.compose.PreviewWithTheme

@Composable
fun AccountScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Account",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview() {
    PreviewWithTheme {
        AccountScreen()
    }
}
