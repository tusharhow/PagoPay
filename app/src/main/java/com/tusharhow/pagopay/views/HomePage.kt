package com.tusharhow.pagopay.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.tusharhow.pagopay.R
import com.tusharhow.pagopay.components.BottomBar
import com.tusharhow.pagopay.navigation.Screen
import com.tusharhow.pagopay.widgets.CardsCard
import com.tusharhow.pagopay.widgets.HistoryCard
import com.tusharhow.pagopay.widgets.PaymentCard
import com.tusharhow.pagopay.widgets.TopAppBarWidget

@Composable
fun HomePage(navController: NavController) {
    Scaffold(

        bottomBar = {
            Box {
                BottomBar(modifier = Modifier.align(Alignment.BottomCenter))
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(bottom = 55.dp)
                        .clip(CircleShape)
                        .background(Color(0xfff6bfc9))
                        .align(Alignment.BottomCenter)
                        .padding(10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.qr_code),
                        contentDescription = "",
                        modifier = Modifier
                            .size(25.dp),



                    )
                }
            }
        }
    ) {
        it
        Column {
            TopAppBarWidget()
            Spacer(modifier = Modifier.height(16.dp * 2))
            Text(
                text = "Balance", style = TextStyle(
                    color = Color(0xff19224d),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,

                    ),
                modifier = Modifier.padding(start = 16.dp)

            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            ) {
                Text(
                    text = "35,000",
                    style = MaterialTheme.typography.titleMedium.copy(
                        color = Color(0xff19224d),
                    ),


                    )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "$",
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontSize = 20.sp,
                        color = Color.Red,
                        fontWeight = FontWeight.Bold
                    ),

                    )

                Spacer(modifier = Modifier.weight(1f))
                Box(
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                        .background(
                            Color(0xff19224d),
                            shape = RoundedCornerShape(50)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.plus),
                        contentDescription = "",
                        colorFilter = ColorFilter.tint(Color.White)

                    )
                }

            }

            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            ) {
                Column {
                    PaymentCard()
                    Spacer(modifier = Modifier.height(16.dp))
                    Box(
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .background(
                                Color(0xfffe8d5c),
                                shape = RoundedCornerShape(50)
                            ),
                        contentAlignment = Alignment.Center
                    ) {

                        Box {
                            Box(
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp)
                                    .background(
                                        Color.White,
                                        shape = RoundedCornerShape(50)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.notification),
                                    contentDescription = "",


                                    )

                            }
                            Box(
                                modifier = Modifier
                                    .height(20.dp)
                                    .width(20.dp)
                                    .background(
                                        Color(0xff19224d),
                                        shape = RoundedCornerShape(50)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "2", style = TextStyle(
                                        color = Color.White,
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
                            }
                        }
                    }

                }
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    HistoryCard(
                        onClick = {
                            navController.navigate(Screen.HistoryScreen.route)
                        }
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    CardsCard()


                }
            }
        }
    }
}

