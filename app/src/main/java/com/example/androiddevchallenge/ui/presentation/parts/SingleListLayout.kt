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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.data.Garden
import dev.chrisbanes.accompanist.glide.GlideImage

@Composable
fun SingleListLayout(data: Garden) {
    Row(
        modifier = Modifier.wrapContentHeight()
            .height(100.dp)
            .padding(start = 16.dp, end = 16.dp, bottom = 10.dp),
    ) {
        Card {
            GlideImage(
                data.imgUrl,
                modifier = Modifier.size(100.dp),
                contentDescription = null,
                fadeIn = true,
                contentScale = ContentScale.Crop,
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row {
                Column(modifier = Modifier.width(220.dp)) {
                    Text(
                        modifier = Modifier
                            .padding(start = 10.dp, top = 16.dp),
                        text = data.name,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                    Text(
                        modifier = Modifier.padding(start = 10.dp),
                        text = "This is a description",
                        fontSize = 14.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                CheckBox()
            }
            Spacer(Modifier.height(33.dp))
            Divider(Modifier.height(1.dp).padding(start = 10.dp))
        }
    }
}

@Preview
@Composable
fun SingleListLayoutPreview() {
    Row(
        modifier = Modifier.wrapContentHeight()
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier.width(80.dp)
                .height(80.dp)
                .background(Color.Gray)
        )
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row {
                Column(modifier = Modifier.width(220.dp)) {
                    Text(
                        modifier = Modifier
                            .padding(start = 10.dp, top = 16.dp),
                        text = "Test",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                    Text(
                        modifier = Modifier.padding(start = 10.dp),
                        text = "This is a description",
                        fontSize = 14.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                CheckBox()
            }
            Spacer(Modifier.height(30.dp))
            Divider(Modifier.height(1.dp).background(Color.LightGray))
        }
    }
}
