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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.ScreenList
import com.example.androiddevchallenge.ui.theme.gray
import com.example.androiddevchallenge.ui.theme.green300
import com.example.androiddevchallenge.ui.theme.green900
import com.example.androiddevchallenge.ui.theme.pink100
import com.example.androiddevchallenge.ui.theme.pink900
import com.example.androiddevchallenge.ui.theme.white

@Composable
fun WelcomeScreen(navController: NavHostController) {
    val isLightTheme = MaterialTheme.colors.isLight
    val res1 = if (isLightTheme) {
        painterResource(R.drawable.ic_light_welcome_bg)
    } else {
        painterResource(R.drawable.ic_dark_welcome_bg)
    }

    val res2 = if (isLightTheme) {
        painterResource(R.drawable.ic_light_welcome_illos)
    } else {
        painterResource(R.drawable.ic_dark_welcome_illos)
    }

    val res3 = if (isLightTheme) {
        painterResource(R.drawable.ic_light_logo)
    } else {
        painterResource(R.drawable.ic_dark_logo)
    }

    val bgColor = if (isLightTheme) {
        pink100
    } else {
        green900
    }

    val color1 = if (isLightTheme) {
        white
    } else {
        gray
    }

    val color2 = if (isLightTheme) {
        pink900
    } else {
        green300
    }

    val color3 = if (isLightTheme) {
        pink900
    } else {
        white
    }

    val color4 = if (isLightTheme) {
        gray
    } else {
        white
    }

    Box(Modifier.fillMaxSize().background(bgColor))

    Image(
        painter = res1,
        contentDescription = null
    )
    Column {
        Spacer(modifier = Modifier.height(72.dp))
        Row {
            Spacer(modifier = Modifier.width(88.dp))
            Image(
                painter = res2,
                contentDescription = null
            )
        }
        Spacer(modifier = Modifier.height(48.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = res3,
                contentDescription = null
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .height(32.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = "Beautiful home garden solutions",
                style = MaterialTheme.typography.subtitle1,
                color = color4
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Button(
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            onClick = {
            },
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = color2
            ),
            shape = RoundedCornerShape(24.dp)
        ) {
            Text(
                modifier = Modifier.height(32.dp)
                    .padding(top = 5.dp),
                text = "Create account",
                color = color1,
                fontSize = 14.sp
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 10.dp)
                .height(48.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                modifier = Modifier.height(48.dp)
                    .padding(top = 5.dp)
                    .clickable {
                        navController.navigate(ScreenList.LoginScreen.route) {
                            launchSingleTop = true
                        }
                    },
                text = "Log in",
                color = color3,
                style = MaterialTheme.typography.button
            )
        }
    }
}
