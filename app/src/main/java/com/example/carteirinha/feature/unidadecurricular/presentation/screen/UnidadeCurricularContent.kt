package com.example.carteirinha.feature.unidadecurricular.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteirinha.feature.unidadecurricular.domain.model.UnidadeCurricular
import com.example.carteirinha.feature.unidadecurricular.presentation.component.UnidadeCurricularCard

@Composable
fun UnidadeCurricularContent(
    modifier: Modifier = Modifier,
    unidadeCurriculares: List<UnidadeCurricular>
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(top = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(unidadeCurriculares) { uc ->
            UnidadeCurricularCard(unidadeCurricular = uc)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun UnidadeCurricularContentPreview(){
    MaterialTheme() {
        UnidadeCurricularContent(
            unidadeCurriculares = listOf(
                UnidadeCurricular("1", "Materia1", "Prof1", 1.0, 2.0, 1.5, 1),
                UnidadeCurricular("2", "Materia2", "Prof2", 2.0, 3.0, 2.5, 2)
            )
        )
    }
}