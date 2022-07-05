package com.brown.moneytree.util.compose

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.brown.moneytree.ui.screen.Screen
import com.brown.moneytree.ui.screen.Tab

class TabBuilder(
    private val navGraphBuilder: NavGraphBuilder,
    private val tab: Tab
) {
    fun addScreen(
        screen: Screen,
        content: @Composable () -> Unit
    ) {
        navGraphBuilder.composable(
            route = screen.createRoute(tab)
        ) {
            content()
        }
    }
}

fun NavGraphBuilder.tab(
    tab: Tab,
    startScreen: Screen,
    navigationBuilder: (tabBuilder: TabBuilder) -> Unit
) {
    navigation(
        startDestination = startScreen.createRoute(tab),
        route = tab.route
    ) {
        val tabBuilder = TabBuilder(this, tab)
        navigationBuilder(tabBuilder)
    }
}
