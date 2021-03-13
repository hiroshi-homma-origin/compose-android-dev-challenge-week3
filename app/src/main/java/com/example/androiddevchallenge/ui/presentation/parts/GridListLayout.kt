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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Garden
import dev.chrisbanes.accompanist.glide.GlideImage

@Composable
fun GridListLayout(garden: Garden) {
    Card(
        modifier = Modifier.width(160.dp)
            .wrapContentHeight()
            .padding(5.dp)
            .clickable { },
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier.wrapContentSize()
        ) {
            GlideImage(
                garden.imgUrl,
                modifier = Modifier.fillMaxWidth()
                    .height(126.dp),
                contentDescription = null,
                fadeIn = true,
                contentScale = ContentScale.Crop
            )
            Text(
                modifier = Modifier.padding(10.dp),
                text = garden.name,
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
        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
                    .height(150.dp)
                    .background(Color.Gray)
            )
            Text(

                text = "XXXXXXXXX",
                style = MaterialTheme.typography.subtitle1,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}
