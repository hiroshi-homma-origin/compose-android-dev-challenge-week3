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

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.green300
import com.example.androiddevchallenge.ui.theme.pink900

@Composable
fun CheckBox() {
    val isLightTheme = MaterialTheme.colors.isLight
    val color2 = if (isLightTheme) {
        pink900
    } else {
        green300
    }
    val checkedState = remember { mutableStateOf(false) }
    Checkbox(
        modifier = Modifier.padding(top = 24.dp)
            .size(24.dp)
            .clickable {
                checkedState.value = !checkedState.value
            },
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it },
        colors = CheckboxDefaults.colors(
            checkedColor = color2
        )
    )
}
