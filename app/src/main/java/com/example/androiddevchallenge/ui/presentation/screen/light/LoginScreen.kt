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

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.data.ScreenList
import com.example.androiddevchallenge.ui.presentation.parts.LoginTextFiled1
import com.example.androiddevchallenge.ui.presentation.parts.LoginTextFiled2
import com.example.androiddevchallenge.ui.theme.gray
import com.example.androiddevchallenge.ui.theme.green300
import com.example.androiddevchallenge.ui.theme.pink900
import com.example.androiddevchallenge.ui.theme.white

@Composable
fun LoginScreen(navController: NavHostController) {
    val isLightTheme = MaterialTheme.colors.isLight

    val color1 = if (isLightTheme) {
        gray
    } else {
        white
    }

    val color2 = if (isLightTheme) {
        pink900
    } else {
        green300
    }

    val color3 = if (isLightTheme) {
        white
    } else {
        gray
    }

    Row(
        modifier = Modifier.fillMaxSize()
            .padding(top = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Log in with email",
                    color = color1,
                    style = MaterialTheme.typography.h5
                )
            }
            LoginTextFiled1()
            Spacer(modifier = Modifier.height(8.dp))
            LoginTextFiled2()
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    text = "By clicking below, you agree to our ",
                    style = MaterialTheme.typography.body2,
                    fontSize = 12.sp,
                    color = color1,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Tearms Of Users",
                    style = TextStyle(textDecoration = TextDecoration.Underline),
                    fontSize = 12.sp,
                    color = color1,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "and consent",
                    style = MaterialTheme.typography.body2,
                    fontSize = 12.sp,
                    color = color1,
                    textAlign = TextAlign.Center
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    text = "to our ",
                    style = MaterialTheme.typography.body2,
                    fontSize = 12.sp,
                    color = color1,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Privacy Policy",
                    style = TextStyle(textDecoration = TextDecoration.Underline),
                    fontSize = 12.sp,
                    color = color1,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                onClick = {
                    navController.navigate(ScreenList.HomeScreen.route) {
                        launchSingleTop = true
                    }
                },
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = color2
                ),
                shape = RoundedCornerShape(24.dp)
            ) {
                Text(
                    modifier = Modifier.height(32.dp)
                        .padding(top = 5.dp),
                    text = "Log in",
                    color = color3,
                    style = MaterialTheme.typography.button
                )
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun LoginScreenPreview() {
}
