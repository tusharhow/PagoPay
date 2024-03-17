package com.tusharhow.pagopay.views

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
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
import androidx.navigation.NavController
import com.tusharhow.pagopay.R
import com.tusharhow.pagopay.components.HistoryItem
import com.tusharhow.pagopay.dummy_data.historyData

@Composable
fun HistoryPage(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xfffcda67))
    ) {
        Spacer(modifier = Modifier.height(16.dp*2))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.back),
                contentDescription = null,
                modifier = Modifier
                    .size(25.dp)
                    .clickable {
                        navController.popBackStack()
                    }
            )
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(id = R.drawable.open_menu),
                contentDescription = null,
                modifier = Modifier.size(25.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp * 3))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        ) {
            Text(
                text = "History",
                style = MaterialTheme.typography.titleMedium.copy(
                    color = Color(0xff19224d),
                    fontSize = 25.sp
                ),
            )
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(id = R.drawable.dots),
                contentDescription = null,
                modifier = Modifier.size(25.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment =  Alignment.CenterHorizontally
        ) {
            items(historyData.size) {
                val item = historyData[it]
                HistoryItem(
                    iconBgColor = item.iconBgColor,
                    icon =  item.icon,
                    title =  item.title,
                    subtitle =  item.subtitle,
                    amount =  item.amount
                )
            }
            item {
                Text(text = "See All", style = TextStyle(
                    color = Color(0xff19224d),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                ), modifier = Modifier.padding(bottom=16.dp, top = 10.dp))


            }
        }
    }
}