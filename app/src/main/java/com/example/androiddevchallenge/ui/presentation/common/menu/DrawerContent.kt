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
package com.example.androiddevchallenge.ui.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.data.GeneralObject.items
import com.example.androiddevchallenge.ui.theme.purple500
import kotlinx.coroutines.launch

@Composable
fun DrawerContent(
    navController: NavHostController,
    scaffoldState: ScaffoldState
) {
    val scope = rememberCoroutineScope()
    LazyColumn(
        modifier = Modifier.fillMaxHeight()
            .clickable {
                scope.launch {
                    scaffoldState.drawerState.close()
                }
            }
    ) {
        item {
            Row(
                modifier = Modifier.fillParentMaxWidth()
                    .height(56.dp)
                    .background(purple500),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Drawer Menu",
                    color = Color.White,
                    fontSize = 20.sp,
                    style = MaterialTheme.typography.subtitle1
                )
            }
            items.forEach { i ->
                Button(
                    modifier = Modifier.fillParentMaxWidth()
                        .padding(10.dp),
                    onClick = {
                        navController.navigate(i.route) {
                            launchSingleTop = true
                        }
                        scope.launch {
                            scaffoldState.drawerState.close()
                        }
                    },
                    colors = ButtonDefaults.textButtonColors(
                        backgroundColor = purple500
                    )
                ) {
                    Text(
                        text = i.route,
                        color = Color.White,
                        style = MaterialTheme.typography.subtitle2
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DrawerContentPreview() {
    LazyColumn {
        item {
            Row(
                modifier = Modifier.fillParentMaxWidth()
                    .height(56.dp)
                    .background(purple500),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Drawer Menu",
                    color = Color.White,
                    fontSize = 20.sp,
                    style = MaterialTheme.typography.subtitle1
                )
            }
            items.forEach { i ->
                Button(
                    modifier = Modifier.fillParentMaxWidth()
                        .padding(10.dp),
                    onClick = {
                        /*do something*/
                    },
                    colors = ButtonDefaults.textButtonColors(
                        backgroundColor = purple500
                    )
                ) {
                    Text(
                        text = i.route,
                        color = Color.White,
                        style = MaterialTheme.typography.subtitle2
                    )
                }
            }
        }
    }
}
