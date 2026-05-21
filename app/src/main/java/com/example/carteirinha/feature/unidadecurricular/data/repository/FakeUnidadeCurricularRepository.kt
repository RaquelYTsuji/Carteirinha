package com.example.carteirinha.feature.unidadecurricular.data.repository

import com.example.carteirinha.feature.unidadecurricular.domain.model.UnidadeCurricular
import kotlinx.coroutines.delay

class FakeUnidadeCurricularRepository : UnidadeCurricularRepository{
    override suspend fun buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>>{
        delay(1800)

        return Result.success(
            listOf(
                UnidadeCurricular("1", "Materia1", "Prof1", 1.0, 2.0, 1.5, 1),
                UnidadeCurricular("2", "Materia2", "Prof2", 2.0, 3.0, 2.5, 2),
                UnidadeCurricular("3", "Materia3", "Prof3", 3.0, 4.0, 3.5, 2),
                UnidadeCurricular("4", "Materia4", "Prof4", 4.0, 5.0, 4.5, 2),
                UnidadeCurricular("5", "Materia5", "Prof5", 5.0, 6.0, 5.5, 2),
                UnidadeCurricular("6", "Materia6", "Prof6", 6.0, 7.0, 6.5, 2),
                UnidadeCurricular("7", "Materia7", "Prof7", 7.0, 8.0, 7.5, 2),
                UnidadeCurricular("8", "Materia8", "Prof8", 8.0, 9.0, 8.5, 2),
                )
        )
    }
}