package com.tusharhow.pagopay.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tusharhow.pagopay.R

@Composable
fun PaymentCard() {
    Box(
        modifier = Modifier
            .height(400.dp)
            .width(200.dp)
            .background(
                Color(0xFFd8eef2),
                shape = RoundedCornerShape(50)
            )
            .clickable { },
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.padding(top = 16.dp * 3, bottom = 16.dp * 2),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Payments",
                style = TextStyle(
                    color = Color.DarkGray,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(16.dp * 2))
            Row {
                Image(
                    painter = painterResource(id = R.drawable.user2),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(4.dp, 4.dp)
                        .size(60.dp)
                        .clip(CircleShape),

                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.width(5.dp))
                Image(
                    painter = painterResource(id = R.drawable.user3),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(4.dp, 4.dp)
                        .size(50.dp)
                        .clip(CircleShape),

                    contentScale = ContentScale.Crop,
                )
            }

            Image(
                painter = painterResource(id = R.drawable.user4),
                contentDescription = "",
                modifier = Modifier
                    .padding(4.dp, 4.dp)
                    .size(50.dp)
                    .clip(CircleShape),

                contentScale = ContentScale.Crop,
            )

            Spacer(modifier = Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .background(
                        Color.White,
                        shape = RoundedCornerShape(50)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = "",


                    )

            }
        }
    }
}