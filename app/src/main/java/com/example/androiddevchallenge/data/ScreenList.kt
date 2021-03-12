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
package com.example.androiddevchallenge.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Details
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.More
import androidx.compose.material.icons.filled.PlaylistPlay
import androidx.compose.material.icons.filled.Receipt
import androidx.compose.ui.graphics.vector.ImageVector

sealed class ScreenList(val route: String, val icon: ImageVector) {
    object Screen1 : ScreenList("Screen1", Icons.Filled.Home)
    object Screen2 : ScreenList("Screen2", Icons.Filled.Details)
    object Screen3 : ScreenList("Screen3", Icons.Filled.PlaylistPlay)
    object Screen4 : ScreenList("Screen4", Icons.Filled.Receipt)
    object Screen5 : ScreenList("Screen5", Icons.Filled.More)
}
