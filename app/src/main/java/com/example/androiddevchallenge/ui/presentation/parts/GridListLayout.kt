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
package com.example.androiddevchallenge.ui.presentation.parts

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.KEY_ROUTE
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.androiddevchallenge.data.ScreenList
import dev.chrisbanes.accompanist.glide.GlideImage

@Composable
fun GridListLayout(number: Int, navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.arguments?.getString(KEY_ROUTE)
    val index = number + 1
    Card(
        modifier = Modifier.fillMaxWidth()
            .wrapContentHeight()
            .padding(8.dp)
            .clickable { },
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier.wrapContentSize()
                .padding(10.dp)
        ) {
            GlideImage(
                "https://pbs.twimg.com/profile_images/874463635950551040/IhlhyWsq_400x400.jpg",
                modifier = Modifier.fillMaxWidth(),
                contentDescription = null,
                fadeIn = true
            )
            Text(
                text = currentRoute + "_" + index,
                style = MaterialTheme.typography.subtitle1
            )
            Text(
                text = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                style = MaterialTheme.typography.subtitle1,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview
@Composable
fun GridListLayoutPreview() {
    Card(
        modifier = Modifier.fillMaxWidth()
            .wrapContentHeight()
            .padding(8.dp)
            .clickable { },
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier.wrapContentSize()
                .padding(10.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
                    .height(150.dp)
                    .background(Color.Gray)
            )
            Text(
                text = ScreenList.Screen1.route + "_",
                style = MaterialTheme.typography.subtitle1
            )
            Text(
                text = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                style = MaterialTheme.typography.subtitle1,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}
