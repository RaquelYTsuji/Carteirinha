package com.example.carteirinha.feature.unidadecurricular.presentation

sealed interface UnidadeCurricularEvent {
    data object OnCarregarDados: UnidadeCurricularEvent
    data object OnTentarNovamenteClick: UnidadeCurricularEvent
    data object OnVoltarClick: UnidadeCurricularEvent
}