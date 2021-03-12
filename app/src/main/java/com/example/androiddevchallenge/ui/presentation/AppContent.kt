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
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.presentation.common.DrawerContent
import com.example.androiddevchallenge.ui.presentation.common.DrawerContentPreview
import com.example.androiddevchallenge.ui.presentation.common.button.FAButton
import com.example.androiddevchallenge.ui.presentation.common.menu.BottomNavMenu
import com.example.androiddevchallenge.ui.presentation.common.menu.BottomNavMenuPreview
import com.example.androiddevchallenge.ui.presentation.common.menu.TopAppBarMenu
import com.example.androiddevchallenge.ui.presentation.common.menu.TopAppBarMenuPreview

@Composable
fun MyAppContent() {
    val navController = rememberNavController()
//    val navBackStackEntry by navController.currentBackStackEntryAsState()
//    val currentRoute = navBackStackEntry?.arguments?.getString(KEY_ROUTE)
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))

    Surface(color = MaterialTheme.colors.background) {
        Scaffold(
            drawerContent = { DrawerContent(navController, scaffoldState) },
            topBar = { TopAppBarMenu(scaffoldState) },
            bottomBar = { BottomNavMenu(navController) },
            floatingActionButton = {
//            if (currentRoute == ScreenList.Screen1.route) {
                FAButton()
//            }
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
            drawerContent = { DrawerContentPreview() },
            topBar = { TopAppBarMenuPreview() },
            bottomBar = { BottomNavMenuPreview() },
            floatingActionButton = {
//            if (currentRoute == ScreenList.Screen1.route) {
                FAButton()
//            }
            },
            scaffoldState = scaffoldState
        ) {
            NavigationPreview1()
        }
    }
}

@Preview
@Composable
fun MyAppContentPreview2() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    Surface(color = MaterialTheme.colors.background) {
        Scaffold(
            drawerContent = { DrawerContentPreview() },
            topBar = { TopAppBarMenuPreview() },
            bottomBar = { BottomNavMenuPreview() },
            floatingActionButton = {
//            if (currentRoute == ScreenList.Screen1.route) {
                FAButton()
//            }
            },
            scaffoldState = scaffoldState
        ) {
            NavigationPreview2()
        }
    }
}

@Preview
@Composable
fun MyAppContentPreview3() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    Surface(color = MaterialTheme.colors.background) {
        Scaffold(
            drawerContent = { DrawerContentPreview() },
            topBar = { TopAppBarMenuPreview() },
            bottomBar = { BottomNavMenuPreview() },
            floatingActionButton = {
//            if (currentRoute == ScreenList.Screen1.route) {
                FAButton()
//            }
            },
            scaffoldState = scaffoldState
        ) {
            NavigationPreview3()
        }
    }
}

@Preview
@Composable
fun MyAppContentPreview4() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    Surface(color = MaterialTheme.colors.background) {
        Scaffold(
            drawerContent = { DrawerContentPreview() },
            topBar = { TopAppBarMenuPreview() },
            bottomBar = { BottomNavMenuPreview() },
            floatingActionButton = {
//            if (currentRoute == ScreenList.Screen1.route) {
                FAButton()
//            }
            },
            scaffoldState = scaffoldState
        ) {
            NavigationPreview4()
        }
    }
}

@Preview
@Composable
fun MyAppContentPreview5() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    Surface(color = MaterialTheme.colors.background) {
        Scaffold(
            drawerContent = { DrawerContentPreview() },
            topBar = { TopAppBarMenuPreview() },
            bottomBar = { BottomNavMenuPreview() },
            floatingActionButton = {
//            if (currentRoute == ScreenList.Screen1.route) {
                FAButton()
//            }
            },
            scaffoldState = scaffoldState
        ) {
            NavigationPreview5()
        }
    }
}
