package com.example.carteirinha.feature.unidadecurricular.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.carteirinha.feature.unidadecurricular.presentation.UnidadeCurricularEvent
import com.example.carteirinha.feature.unidadecurricular.presentation.UnidadeCurricularViewModel

@Composable
fun UnidadeCurricularScreen (
    modifier: Modifier = Modifier,
    navController: NavController,
    viewModel: UnidadeCurricularViewModel = viewModel()
){
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    UnidadeCurricularContent(
        uiState = uiState,
        onEvent = { event ->
            when(event){
                UnidadeCurricularEvent.OnVoltarClick -> Unit
                else -> viewModel.onEvent(event)
            }
        }
    )

}