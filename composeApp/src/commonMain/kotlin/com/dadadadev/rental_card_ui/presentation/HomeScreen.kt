package com.dadadadev.rental_card_ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dadadadev.rental_card_ui.presentation.components.BottomBar
import com.dadadadev.rental_card_ui.presentation.components.CarList
import com.dadadadev.rental_card_ui.theme.Blur
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.HazeStyle
import dev.chrisbanes.haze.HazeTint
import dev.chrisbanes.haze.haze
import dev.chrisbanes.haze.hazeChild

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    hazeState: HazeState,
    paddingValues: PaddingValues
) {
    Box(
        modifier = modifier
            .background(MaterialTheme.colorScheme.background)
    ) {
        CarList(
            modifier = Modifier
                .fillMaxSize()
                .haze(
                    state = hazeState,
                ),
            paddingValues = paddingValues
        )

        BottomBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 26.dp)
                .align(Alignment.BottomCenter)
                .padding(bottom = 20.dp)
                .clip(RoundedCornerShape(20.dp))
                .hazeChild(
                    hazeState,
                    style = HazeStyle(
                        backgroundColor = Color.Black,
                        tint = HazeTint(Blur),
                        blurRadius = 12.dp
                    )
                )
        )
    }
}