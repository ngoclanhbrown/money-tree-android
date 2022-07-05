package com.brown.moneytree.ui.screen

sealed class Tab(val route: String) {
    object Home : Tab("home")
    object Transaction : Tab("transaction")
    object Planning : Tab("planning")
    object Account : Tab("account")
}

internal object AppNavConfig {
    val allTabs = listOf(
        Tab.Home,
        Tab.Transaction,
        Tab.Planning,
        Tab.Account
    )

    val startDestination = Tab.Home.route
}
