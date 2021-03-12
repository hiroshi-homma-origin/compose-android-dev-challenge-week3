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

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.ui.presentation.parts.CourseListItem
import com.example.androiddevchallenge.ui.presentation.parts.GridListLayout
import com.example.androiddevchallenge.ui.presentation.parts.GridListLayoutPreview

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Screen2(navController: NavHostController) {
    val spanCount = 2

    Column {
        CourseListItem(
            shape = RoundedCornerShape(topStart = 24.dp, bottomEnd = 24.dp),
            modifier = Modifier.height(96.dp)
        )
        LazyVerticalGrid(
            cells = GridCells.Fixed(spanCount),
            modifier = Modifier.padding(bottom = 55.dp)
        ) {
            items(100) {
                GridListLayout(it, navController)
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun Screen2Preview() {
    val spanCount = 2

    Column {
        CourseListItem(
            shape = RoundedCornerShape(topStart = 24.dp, bottomEnd = 24.dp),
            modifier = Modifier.height(96.dp)
        )
        LazyVerticalGrid(
            cells = GridCells.Fixed(spanCount),
            modifier = Modifier.padding(bottom = 55.dp)
        ) {
            items(100) {
                GridListLayoutPreview()
            }
        }
    }
}
