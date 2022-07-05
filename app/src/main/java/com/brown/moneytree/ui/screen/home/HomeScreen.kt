package com.brown.moneytree.ui.screen.home

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.brown.moneytree.util.compose.PreviewWithTheme

@Composable
fun HomeScreen() {
    val homeViewModel = hiltViewModel<HomeViewModel>()
    val homeUiState by homeViewModel.homeUiStateFlow.collectAsState(initial = HomeUiState())

    HomeScreen(homeUiState = homeUiState)
}

@Composable
private fun HomeScreen(
    homeUiState: HomeUiState
) {
    HomeScreen(
        message = homeUiState.message
    )
}

@Composable
private fun HomeScreen(
    message: String
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = message,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview() {
    PreviewWithTheme {
        HomeScreen(homeUiState = HomeUiState("Home"))
    }
}
