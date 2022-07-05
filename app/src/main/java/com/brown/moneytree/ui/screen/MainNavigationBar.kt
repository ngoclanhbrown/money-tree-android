package com.brown.moneytree.ui.screen

import android.content.res.Configuration
import androidx.annotation.StringRes
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarViewMonth
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Note
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.brown.moneytree.R
import com.brown.moneytree.util.compose.PreviewWithTheme

@Composable
internal fun MainNavigationBar(
    currentTab: Tab,
    onTabSelected: (Tab) -> Unit,
    modifier: Modifier = Modifier
) {
    BottomNavigation(modifier = modifier) {
        NavigationItems.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = item.imageVectorIcon,
                        contentDescription = stringResource(item.iconContentDescriptionResId)
                    )
                },
                label = {
                    Text(
                        text = stringResource(item.labelResId),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                selected = item.tab == currentTab,
                onClick = {
                    onTabSelected(item.tab)
                }
            )
        }
    }
}

private class NavigationItem(
    val tab: Tab,
    @StringRes val labelResId: Int,
    val imageVectorIcon: ImageVector,
    @StringRes val iconContentDescriptionResId: Int
)

private val NavigationItems = listOf(
    NavigationItem(
        Tab.Home,
        R.string.label_home,
        Icons.Default.Home,
        R.string.cp_home
    ),
    NavigationItem(
        Tab.Transaction,
        R.string.label_transaction,
        Icons.Default.Note,
        R.string.cp_transaction
    ),
    NavigationItem(
        Tab.Planning,
        R.string.label_planning,
        Icons.Default.CalendarViewMonth,
        R.string.cp_planning
    ),
    NavigationItem(
        Tab.Account,
        R.string.label_account,
        Icons.Default.Person,
        R.string.cp_account
    )
)

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview() {
    PreviewWithTheme {
        MainNavigationBar(
            currentTab = Tab.Home,
            onTabSelected = { }
        )
    }
}
