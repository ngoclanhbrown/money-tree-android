package com.brown.moneytree.ui.screen

sealed class Screen(private val route: String) {
    fun createRoute(tab: Tab) = "${tab.route}/$route"

    object Home : Screen("home")
    object Transaction : Screen("transaction")
    object Planning : Screen("planning")
    object Account : Screen("account")
}
