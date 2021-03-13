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
package com.example.androiddevchallenge.ui.presentation.screen.light

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.data.TestData.columGardenData
import com.example.androiddevchallenge.data.TestData.rowGardenData
import com.example.androiddevchallenge.ui.presentation.parts.GridListLayout
import com.example.androiddevchallenge.ui.presentation.parts.GridListLayoutPreview
import com.example.androiddevchallenge.ui.presentation.parts.SingleListLayout
import com.example.androiddevchallenge.ui.presentation.parts.SingleListLayoutPreview
import com.example.androiddevchallenge.ui.presentation.parts.TextFiled

@Composable
fun HomeScreen(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier.padding(bottom = 55.dp)
    ) {
        item {
            TextFiled()
            Text(
                text = "Browse Theme",
                modifier = Modifier.padding(start = 15.dp, top = 10.dp, bottom = 10.dp),
                style = MaterialTheme.typography.h5
            )
            LazyRow {
                item {
                    Spacer(Modifier.width(10.dp))
                    rowGardenData.forEach {
                        GridListLayout(it)
                    }
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 15.dp, top = 10.dp, bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Design your home garden",
                    style = MaterialTheme.typography.h5
                )
                Spacer(Modifier.width(50.dp))
                Icon(
                    imageVector = Icons.Filled.FilterList,
                    modifier = Modifier.size(30.dp),
                    contentDescription = null
                )
            }
            columGardenData.forEach {
                SingleListLayout(it)
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    LazyColumn(
        modifier = Modifier.padding(bottom = 55.dp)
    ) {
        item {
            TextFiled()
            LazyRow {
                item {
                    repeat(10) {
                        GridListLayoutPreview()
                    }
                }
            }
            repeat(100) {
                SingleListLayoutPreview()
            }
        }
    }
}
