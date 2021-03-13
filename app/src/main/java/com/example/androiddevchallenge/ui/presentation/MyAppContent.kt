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
package com.example.androiddevchallenge.ui.presentation

import androidx.compose.material.DrawerValue
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.KEY_ROUTE
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.ScreenList
import com.example.androiddevchallenge.ui.presentation.common.menu.BottomNavMenu
import com.example.androiddevchallenge.ui.presentation.common.menu.BottomNavMenuPreview

@Composable
fun MyAppContent() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.arguments?.getString(KEY_ROUTE)
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))

    Surface(color = MaterialTheme.colors.background) {
        Scaffold(
            bottomBar = {
                if (currentRoute != ScreenList.WelcomeScreen.route &&
                    currentRoute != ScreenList.LoginScreen.route
                ) {
                    BottomNavMenu(navController)
                }
            },
            scaffoldState = scaffoldState
        ) {
            Navigation(navController)
        }
    }
}

@Preview
@Composable
fun MyAppContentPreview1() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    Surface(color = MaterialTheme.colors.background) {
        Scaffold(
            bottomBar = { BottomNavMenuPreview() },
            scaffoldState = scaffoldState
        ) {
            NavigationPreview1()
        }
    }
}
