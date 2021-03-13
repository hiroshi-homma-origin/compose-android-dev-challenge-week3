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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.KEY_ROUTE
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.data.GeneralObject.items
import com.example.androiddevchallenge.data.ScreenList
import com.example.androiddevchallenge.ui.theme.green900
import com.example.androiddevchallenge.ui.theme.pink100
import com.example.androiddevchallenge.ui.theme.white

@Composable
fun BottomNavMenu(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.arguments?.getString(KEY_ROUTE)
    val isLightTheme = MaterialTheme.colors.isLight

    val color1 = if (isLightTheme) {
        Black
    } else {
        white
    }

    val color2 = if (isLightTheme) {
        Color.LightGray
    } else {
        Color.Gray
    }

    val bgColor = if (isLightTheme) {
        pink100
    } else {
        green900
    }

    BottomNavigation(
        backgroundColor = bgColor
    ) {
        items.filter {
            it.route != ScreenList.WelcomeScreen.route &&
                it.route != ScreenList.LoginScreen.route
        }.forEach { screen ->
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
                alwaysShowLabel = true,
                onClick = {
                    navController.navigate(screen.route) {
                        launchSingleTop = true
                    }
                },
                selectedContentColor = color1,
                unselectedContentColor = color2
            )
        }
    }
}

@Preview
@Composable
fun BottomNavMenuPreview() {
    BottomNavigation {
        items.filter {
            it.route != ScreenList.WelcomeScreen.route &&
                it.route != ScreenList.LoginScreen.route
        }.forEach { screen ->
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
                selected = screen.route == ScreenList.HomeScreen.route,
                alwaysShowLabel = screen.route == ScreenList.HomeScreen.route,
                onClick = { /*do something*/ }
            )
        }
    }
}
