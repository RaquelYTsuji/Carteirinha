package com.example.carteirinha.feature.carteirinha.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carteirinha.feature.carteirinha.presentation.component.LabelText
import com.example.carteirinha.R
import com.example.carteirinha.feature.carteirinha.presentation.component.ValueText
import com.example.carteirinha.core.designsystem.theme.AppTheme
import com.rafaelcosta.myapplication.QrCode


@Composable
fun CarteirinhaScreen(
    modifier: Modifier = Modifier
) {
    CarteirinhaContent(
        qrCodeContent = "seunumerodematriculaaqui",
        modifier = modifier
    )
}