package com.dadadadev.rental_card_ui

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "RentalCarsUIMultiplatform",
    ) {
        App()
    }
}