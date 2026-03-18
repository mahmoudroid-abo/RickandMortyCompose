package com.mahmoudroid.rickandmortycompose.utils

import androidx.compose.ui.graphics.Color
import com.mahmoudroid.data.network.models.domain.CharacterStatus

fun CharacterStatus.asColor(): Color {
    return when (this) {
        CharacterStatus.Alive -> Color.Green
        CharacterStatus.Dead -> Color.Red
        CharacterStatus.Unknown -> Color.Yellow
    }
}