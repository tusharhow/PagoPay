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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tusharhow.pagopay.R

@Composable
fun HistoryCard(
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .height(220.dp)
            .width(130.dp)
            .background(
                Color(0xFFfcda67),
                shape = RoundedCornerShape(50)
            )
            .clickable {
                onClick()
            },
        contentAlignment = Alignment.Center
    ) {
        Column {
            Box {
                Box(
                    modifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                        .background(
                            Color.Black,
                            shape = RoundedCornerShape(50)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.uber),
                        contentDescription = "",
                        modifier = Modifier
                            .size(40.dp),

                        colorFilter = ColorFilter.tint(Color.White)


                    )

                }
                Box(
                    modifier = Modifier
                        .padding(bottom = 50.dp)
                        .height(25.dp)
                        .width(50.dp)
                        .background(
                            Color.White,
                            shape = RoundedCornerShape(30.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "-$123", style = TextStyle(
                            color = Color(0xffffab86),
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Box {
                Box(
                    modifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                        .background(
                            Color(0xff70da44),
                            shape = RoundedCornerShape(50)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.upwork),
                        contentDescription = "",
                        modifier = Modifier
                            .size(40.dp),
                        colorFilter = ColorFilter.tint(Color.White)


                    )

                }
                Box(
                    modifier = Modifier
                        .padding(bottom = 50.dp)
                        .height(25.dp)
                        .width(50.dp)
                        .background(
                            Color.White,
                            shape = RoundedCornerShape(30.dp)
                        )
                        .align(Alignment.TopEnd),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "-$133", style = TextStyle(
                            color = Color(0xff70da44),
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "History", style = TextStyle(
                    color = Color(0xff19224d),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                ),
                modifier = Modifier.align(Alignment.CenterHorizontally)

            )

        }
    }
}