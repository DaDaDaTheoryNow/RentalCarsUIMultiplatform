package com.dadadadev.rental_card_ui.presentation.components

import androidx.compose.ui.graphics.Color
import com.dadadadev.rental_card_ui.presentation.theme.Primary
import com.dadadadev.rental_card_ui.presentation.theme.Secondary
import org.jetbrains.compose.resources.DrawableResource
import rentalcarsuimultiplatform.composeapp.generated.resources.Res
import rentalcarsuimultiplatform.composeapp.generated.resources.*

data class Car(
    val name: String,
    val image: DrawableResource,
    val color: Color,
    val logo: DrawableResource,
    val recommendation: Int,
    val recommendationRate: Float,
    val rentalDays: Int,
    val price: Int,
    val recommenders: List<DrawableResource>,
    val bgColor: Color
)


val luxuriousCars = listOf(
    Car(
        name = "Ferrari SF90 Stradale",
        image = Res.drawable.ferrari_car,
        color = Color.Red,
        logo = Res.drawable.ferrari_logo,
        recommendation = 97,
        recommendationRate = 4.8f,
        rentalDays = 7,
        price = 759,
        recommenders = listOf(
            Res.drawable.m_2, Res.drawable.w_1, Res.drawable.w_2
        ),
        bgColor = Primary
    ),
    Car(
        name = "Rolls-Royce Phantom",
        image = Res.drawable.rolls_royce_car,
        color = Color.Black,
        logo = Res.drawable.rolls_royce_logo,
        recommendation = 98,
        recommendationRate = 4.7f,
        rentalDays = 10,
        price = 799,
        recommenders = listOf(
            Res.drawable.m_1, Res.drawable.w_2, Res.drawable.m_3
        ),
        bgColor = Secondary
    ),
    Car(
        name = "Porsche 911 Turbo S",
        image = Res.drawable.porsche_car,
        color = Color.Yellow,
        logo = Res.drawable.porsche_logo,
        recommendation = 99,
        recommendationRate = 4.8f,
        rentalDays = 6,
        price = 689,
        recommenders = listOf(
            Res.drawable.m_3, Res.drawable.w_1, Res.drawable.m_1
        ),
        bgColor = Primary
    ),
    Car(
        name = "Lamborghini Aventador",
        image = Res.drawable.lamborghini_car,
        color = Color.White,
        logo = Res.drawable.lamborghini_logo,
        recommendation = 97,
        recommendationRate = 4.9f,
        rentalDays = 5,
        price = 649,
        recommenders = listOf(
            Res.drawable.w_1, Res.drawable.w_2, Res.drawable.m_2
        ),
        bgColor = Secondary
    )
)
