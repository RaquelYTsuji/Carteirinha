package com.example.carteirinha.feature.unidadecurricular.data.repository

import com.example.carteirinha.feature.unidadecurricular.domain.model.UnidadeCurricular
import kotlinx.coroutines.delay

class FakeUnidadeCurricularRepository : UnidadeCurricularRepository{
    override suspend fun buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>>{
        delay(1800)

        return Result.success(
            listOf(
                UnidadeCurricular("1", "Materia1", "Prof1", 1.0, 2.0, 1.5, 1),
                UnidadeCurricular("2", "Materia1", "Prof2", 2.0, 3.0, 2.5, 2)
            )
        )
    }
}