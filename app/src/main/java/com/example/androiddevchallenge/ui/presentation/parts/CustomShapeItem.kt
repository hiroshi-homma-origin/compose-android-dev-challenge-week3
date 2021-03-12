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
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CourseListItem(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    elevation: Dp = 4.dp,
    titleStyle: TextStyle = MaterialTheme.typography.h5
) {
    Surface(
        elevation = elevation,
        shape = shape,
        modifier = modifier.fillMaxWidth()
            .padding(15.dp)
    ) {
        Row(
            modifier = Modifier.clickable {
            }.background(Color.Cyan),
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier.padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 8.dp
                )
            ) {
                Text(
                    text = "Shape Layout",
                    style = titleStyle,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .weight(1f)
                        .padding(bottom = 4.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun CourseListItemPreview(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    elevation: Dp = 4.dp,
    titleStyle: TextStyle = MaterialTheme.typography.h3
) {
    Surface(
        elevation = elevation,
        shape = shape,
        modifier = modifier.padding(15.dp)
    ) {
        Row(
            modifier = Modifier.clickable {
            }
        ) {
            Column(
                modifier = Modifier.padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 8.dp
                )
            ) {
                Text(
                    text = "Test Layout1",
                    style = titleStyle,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .weight(1f)
                        .padding(bottom = 4.dp)
                )
            }
        }
    }
}