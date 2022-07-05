package com.brown.moneytree.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.brown.moneytree.ui.screen.account.AccountScreen
import com.brown.moneytree.ui.screen.home.HomeScreen
import com.brown.moneytree.ui.screen.planning.PlanningScreen
import com.brown.moneytree.ui.screen.transaction.TransactionScreen
import com.brown.moneytree.util.compose.tab

@Composable
internal fun MainNavigation(
    navController: NavHostController,
    modifier: Modifier
) {
    NavHost(
        navController = navController,
        startDestination = AppNavConfig.startDestination,
        modifier = modifier
    ) {
        tab(tab = Tab.Home, startScreen = Screen.Home) {
            it.addScreen(screen = Screen.Home) {
                HomeScreen()
            }
        }
        tab(tab = Tab.Transaction, startScreen = Screen.Transaction) {
            it.addScreen(screen = Screen.Transaction) {
                TransactionScreen()
            }
        }
        tab(tab = Tab.Planning, startScreen = Screen.Planning) {
            it.addScreen(screen = Screen.Planning) {
                PlanningScreen()
            }
        }
        tab(tab = Tab.Account, startScreen = Screen.Account) {
            it.addScreen(screen = Screen.Account) {
                AccountScreen()
            }
        }
    }
}
