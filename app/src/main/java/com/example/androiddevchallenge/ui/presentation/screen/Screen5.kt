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
package com.example.androiddevchallenge.ui.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.ui.presentation.parts.SingleListLayout
import com.example.androiddevchallenge.ui.presentation.parts.SingleListLayoutPreview

@Composable
fun Screen5(navController: NavHostController) {
    Box(Modifier.fillMaxSize().background(Color.White)) {
        LazyColumn(
            modifier = Modifier.padding(bottom = 55.dp)
        ) {
            item {
                repeat(100) {
                    SingleListLayout(it, navController)
                }
            }
        }
    }
}

@Preview
@Composable
fun Screen5Preview() {
    Box(Modifier.fillMaxSize().background(Color.White)) {
        LazyColumn(
            modifier = Modifier.padding(bottom = 55.dp)
        ) {
            item {
                repeat(100) {
                    SingleListLayoutPreview()
                }
            }
        }
    }
}
