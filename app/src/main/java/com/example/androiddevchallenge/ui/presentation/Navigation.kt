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

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.KEY_ROUTE
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.androiddevchallenge.data.GeneralObject.items
import com.example.androiddevchallenge.data.ScreenList
import com.example.androiddevchallenge.ui.presentation.screen.Screen2
import com.example.androiddevchallenge.ui.presentation.screen.Screen2Preview
import com.example.androiddevchallenge.ui.presentation.screen.Screen3
import com.example.androiddevchallenge.ui.presentation.screen.Screen3Preview
import com.example.androiddevchallenge.ui.presentation.screen.Screen4
import com.example.androiddevchallenge.ui.presentation.screen.Screen4Preview
import com.example.androiddevchallenge.ui.presentation.screen.light.HomeScreen
import com.example.androiddevchallenge.ui.presentation.screen.light.HomeScreenPreview
import com.example.androiddevchallenge.ui.presentation.screen.light.LoginScreen
import com.example.androiddevchallenge.ui.presentation.screen.light.WelcomeScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = ScreenList.WelcomeScreen.route) {
        items.forEach { screen ->
            composable(screen.route) {
                when (it.arguments?.getString(KEY_ROUTE)) {
                    ScreenList.WelcomeScreen.route -> WelcomeScreen(navController)
                    ScreenList.LoginScreen.route -> LoginScreen(navController)
                    ScreenList.HomeScreen.route -> HomeScreen(navController)
                    ScreenList.Screen2.route -> Screen2(navController)
                    ScreenList.Screen3.route -> Screen3(navController)
                    ScreenList.Screen4.route -> Screen4(navController)
                }
            }
        }
    }
}

@Preview
@Composable
fun NavigationPreview1() {
    HomeScreenPreview()
}

@Preview
@Composable
fun NavigationPreview2() {
    Screen2Preview()
}

@Preview
@Composable
fun NavigationPreview3() {
    Screen3Preview()
}

@Preview
@Composable
fun NavigationPreview4() {
    Screen4Preview()
}
