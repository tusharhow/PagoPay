package com.tusharhow.pagopay.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tusharhow.pagopay.R

@Composable
fun TopAppBarWidget() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp, start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Image(
            painter = painterResource(id = R.drawable.menu),
            contentDescription = null
        )
        Box(
            modifier = Modifier
                .height(55.dp)
                .width(110.dp)
                .background(
                    Color(0xFFE5E5E5),
                    shape = RoundedCornerShape(50)
                )

        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.user),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(4.dp, 4.dp)
                        .size(50.dp)
                        .clip(CircleShape),

                    contentScale = ContentScale.Crop,
                )

                Box(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .size(35.dp)
                        .background(
                            Color.White,
                            shape = RoundedCornerShape(50)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.category),
                        contentDescription = "",
                    )
                }

            }

        }

    }
}