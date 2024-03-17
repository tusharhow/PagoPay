package com.tusharhow.pagopay.models

import androidx.compose.ui.graphics.Color


data class History(
    val iconBgColor: Color,
    val icon: Int,
    val title: String,
    val subtitle: String,
    val amount: String
)