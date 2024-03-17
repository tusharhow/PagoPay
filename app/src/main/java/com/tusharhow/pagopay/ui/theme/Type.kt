package com.tusharhow.pagopay.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.tusharhow.pagopay.R


//val provider = GoogleFont.Provider(
//    providerAuthority = "com.google.android.gms.fonts",
//    providerPackage = "com.google.android.gms",
//    certificates = R.array.com_google_android_gms_fonts_certs
//)
//
//val fontName = GoogleFont("Gugi")
//
//val fontFamily = FontFamily(
//    Font(
//        googleFont = fontName,
//        fontProvider = provider
//    )
//)


val Typography = Typography(
    titleMedium = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.sequel)
        ),
        fontWeight = FontWeight.Bold,
        fontSize = 35.sp,

        letterSpacing = 4.sp
    ),


    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )

)