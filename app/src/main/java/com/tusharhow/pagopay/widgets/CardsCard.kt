package com.tusharhow.pagopay.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tusharhow.pagopay.R


@Composable
fun CardsCard() {
    Box(
        modifier = Modifier
            .height(220.dp)
            .width(130.dp)
            .background(
                Color(0xffb8ddb6),
                shape = RoundedCornerShape(50)
            )
            .clickable {

            },
        contentAlignment = Alignment.Center
    ) {
        Column {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Cards", style = TextStyle(
                    color = Color(0xff19224d),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                ),
                modifier = Modifier.align(Alignment.CenterHorizontally)

            )
            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier
                    .height(70.dp)
                    .width(70.dp)
                    .background(
                        Color.White,
                        shape = RoundedCornerShape(50)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.visa),
                    contentDescription = "",
                    modifier = Modifier
                        .size(40.dp),


                    )

            }
            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier
                    .height(70.dp)
                    .width(70.dp)
                    .background(
                        Color.White,
                        shape = RoundedCornerShape(50)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.mastercard),
                    contentDescription = "",
                    modifier = Modifier
                        .size(40.dp),


                    )

            }
        }
    }
}
