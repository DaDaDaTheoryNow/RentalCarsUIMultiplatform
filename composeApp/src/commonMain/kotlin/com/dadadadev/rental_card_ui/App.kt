package com.dadadadev.rental_card_ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import com.dadadadev.rental_card_ui.presentation.HomeScreen
import com.dadadadev.rental_card_ui.presentation.components.Pager
import com.dadadadev.rental_card_ui.presentation.components.TopBar
import com.dadadadev.rental_card_ui.presentation.theme.Blur
import com.dadadadev.rental_card_ui.presentation.theme.RentalCarsUIMultiplatformTheme
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.HazeStyle
import dev.chrisbanes.haze.HazeTint
import dev.chrisbanes.haze.hazeChild
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun App() {
    RentalCarsUIMultiplatformTheme {
        val hazeState = remember { HazeState() }
        val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
            state = rememberTopAppBarState()
        )

        Scaffold(
            modifier = Modifier
                .nestedScroll(scrollBehavior.nestedScrollConnection)
                .fillMaxSize(),
            topBar = {
                Column(
                    modifier = Modifier
                        .hazeChild(
                            hazeState,
                            style = HazeStyle(
                                backgroundColor = Color.Black,
                                tint = HazeTint(Blur),
                                blurRadius = 12.dp
                            )
                        )
                ) {
                    Spacer(modifier = Modifier.height(5.dp))
                    TopBar(
                        scrollBehavior = scrollBehavior,
                    )

                    Pager(
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
        ) { innerPadding ->
            HomeScreen(
                Modifier.fillMaxSize(),
                hazeState = hazeState,
                paddingValues = innerPadding
            )
        }
    }
}