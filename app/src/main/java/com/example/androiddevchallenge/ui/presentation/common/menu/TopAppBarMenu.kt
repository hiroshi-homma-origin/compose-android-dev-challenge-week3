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

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun TopAppBarMenu(scaffoldState: ScaffoldState) {
    val scope = rememberCoroutineScope()
    TopAppBar(
        title = {
            Text(
                text = "Sample App",
                style = MaterialTheme.typography.h5
            )
        },
        contentColor = Color.White,
        navigationIcon = {
            Icon(
                imageVector = Icons.Filled.Menu,
                modifier = Modifier.padding(start = 10.dp)
                    .clickable {
                        scope.launch {
                            scaffoldState.drawerState.open()
                        }
                    },
                contentDescription = null
            )
        }
    )
}

@Preview
@Composable
fun TopAppBarMenuPreview() {
    TopAppBar(
        title = {
            Text(
                text = "Sample App",
                style = MaterialTheme.typography.h5
            )
        },
        contentColor = Color.White,
        navigationIcon = {
            Icon(
                imageVector = Icons.Filled.Menu,
                modifier = Modifier.padding(start = 10.dp)
                    .clickable {
                        /*do something*/
                    },
                contentDescription = null
            )
        }
    )
}
