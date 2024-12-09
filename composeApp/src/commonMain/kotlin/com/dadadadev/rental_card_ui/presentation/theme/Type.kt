package com.dadadadev.rental_card_ui.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import rentalcarsuimultiplatform.composeapp.generated.resources.Res
import rentalcarsuimultiplatform.composeapp.generated.resources.montserrat

@Composable
fun Typography(): Typography = Typography().run {
    copy(
        bodyLarge = TextStyle(
            fontFamily = Font(Res.font.montserrat).toFontFamily(),
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.5.sp
        )
    )
}