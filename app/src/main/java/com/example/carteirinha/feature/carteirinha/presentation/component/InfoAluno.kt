package com.example.carteirinha.feature.carteirinha.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoAluno(
    modifier: Modifier = Modifier,
    labelText: String,
    valueText: String,
    fontSize: TextUnit = MaterialTheme.typography.titleLarge.fontSize,
    fontWeight: FontWeight = MaterialTheme.typography.titleLarge.fontWeight ?: FontWeight.Normal,

    ) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        LabelText(
            labelText,
            modifier = Modifier.weight(1f)
        )
        ValueText(
            valueText,
            modifier = Modifier.weight(4f),
            fontWeight = fontWeight,
            fontSize = fontSize
        )
    }
}