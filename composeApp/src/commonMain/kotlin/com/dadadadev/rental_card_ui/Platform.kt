package com.dadadadev.rental_card_ui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform