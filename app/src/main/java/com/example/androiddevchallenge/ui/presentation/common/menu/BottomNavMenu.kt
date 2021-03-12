/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.presentation.common.menu

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.KEY_ROUTE
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.data.GeneralObject.items
import com.example.androiddevchallenge.data.ScreenList

@Composable
fun BottomNavMenu(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.arguments?.getString(KEY_ROUTE)
    BottomNavigation {
        items.forEach { screen ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = screen.icon,
                        contentDescription = null
                    )
                },
                label = {
                    Text(
                        text = screen.route,
                        style = MaterialTheme.typography.subtitle2
                    )
                },
                selected = screen.route == currentRoute,
                alwaysShowLabel = screen.route == currentRoute,
                onClick = {
                    navController.navigate(screen.route) {
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}

@Preview
@Composable
fun BottomNavMenuPreview() {
    BottomNavigation {
        items.forEach { screen ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = screen.icon,
                        contentDescription = null
                    )
                },
                label = {
                    Text(
                        text = screen.route,
                        style = MaterialTheme.typography.subtitle2
                    )
                },
                selected = screen.route == ScreenList.Screen1.route,
                alwaysShowLabel = screen.route == ScreenList.Screen1.route,
                onClick = { /*do something*/ }
            )
        }
    }
}
