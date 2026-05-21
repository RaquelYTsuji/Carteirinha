package com.example.carteirinha.feature.unidadecurricular.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteirinha.feature.unidadecurricular.domain.model.UnidadeCurricular
import com.example.carteirinha.feature.unidadecurricular.presentation.UnidadeCurricularEvent
import com.example.carteirinha.feature.unidadecurricular.presentation.UnidadeCurricularUiState
import com.example.carteirinha.feature.unidadecurricular.presentation.component.UnidadeCurricularCard

@Composable
fun UnidadeCurricularContent(
    modifier: Modifier = Modifier,
    uiState: UnidadeCurricularUiState,
    onEvent: (UnidadeCurricularEvent) -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize()
            .safeDrawingPadding()
            .padding(16.dp)
    ) {
        when{
            uiState.isLoading -> {
                Column(
                    modifier = Modifier.fillMaxSize()
                    .padding(24.dp),
                    horizontalAlignment =  Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    CircularProgressIndicator()
                    Text(text = "Buscando unidades curriculares",
                        modifier = Modifier.padding(top = 12.dp))
                }
            }
            uiState.errorMessage != null -> {
                Column(
                    modifier = Modifier.fillMaxSize()
                    .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = uiState.errorMessage,
                        color = MaterialTheme.colorScheme.error
                    )
                    Button(
                        onClick = {onEvent(UnidadeCurricularEvent.OnTentarNovamenteClick)},
                        modifier = Modifier.padding(top = 12.dp)
                    ) {
                        Text("Tentar novamente")
                    }
                }
            }
            else -> {
                LazyColumn(
                    modifier = Modifier.fillMaxSize().padding(top = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(uiState.unidadesCurriculares) { uc ->
                        UnidadeCurricularCard(unidadeCurricular = uc)
                    }
                }
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun UnidadeCurricularContentPreview(){
    MaterialTheme() {
        UnidadeCurricularContent(
            uiState = UnidadeCurricularUiState(
                unidadesCurriculares = listOf(
                    UnidadeCurricular("1", "Materia1", "Prof1", 1.0, 2.0, 1.5, 1),
                    UnidadeCurricular("2", "Materia2", "Prof2", 2.0, 3.0, 2.5, 2)
                )
            ),
            onEvent = {}
        )
    }
}