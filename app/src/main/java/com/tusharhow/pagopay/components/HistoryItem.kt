package com.tusharhow.pagopay.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
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
fun HistoryItem(
    iconBgColor: Color,
    icon: Int,
    title: String,
    subtitle : String,
    amount: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(start = 16.dp, end = 16.dp, bottom = 10.dp)
             ,
        colors = CardDefaults.cardColors(
            containerColor = Color.White,

        ),
        shape =  RoundedCornerShape(20),

        ) {
        Row(
            verticalAlignment =  Alignment.CenterVertically,
            horizontalArrangement =  Arrangement.SpaceBetween,
            modifier = Modifier.padding(16.dp),

            ) {
            Box(
                modifier = Modifier
                    .height(60.dp)
                    .width(60.dp)
                    .background(
                        iconBgColor,
                        shape = RoundedCornerShape(50)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id =icon),
                    contentDescription = "",
                    modifier = Modifier
                        .size(40.dp),
                    colorFilter = ColorFilter.tint(Color.White)


                )


            }
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = title,
                    style = TextStyle(
                        color = Color(0xff19224d),
                        fontSize = 20.sp,
                        fontWeight =  FontWeight.Bold

                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = subtitle,
                    style =  TextStyle(
                        color = Color.LightGray,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }

            Spacer(modifier = Modifier.weight(1f))
            Text(
                text =  amount,
                style =  TextStyle(
                    color =  Color(0xff70da44),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            )

        }
    }
}
