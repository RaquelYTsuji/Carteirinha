package com.example.carteirinha

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.rafaelcosta.myapplication.QrCode


@Composable
fun CarteirinhaView(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
            .background(brush = Brush.verticalGradient(
                colors = listOf(
                    MaterialTheme.colorScheme.error,
                    MaterialTheme.colorScheme.onError
                )
            )),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(R.drawable.background_image),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize()
                .graphicsLayer(alpha = 0.3f)
        )
        Card (
            shape = RoundedCornerShape(10),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.background
            ),
            modifier = modifier.fillMaxSize(0.9f)
        ) {
            Column(
                modifier = modifier.fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_senai),
                    contentDescription = "Logo do senai",
                    modifier = modifier.fillMaxWidth(0.9f)
                        .align(Alignment.CenterHorizontally)
                )
                Image(
                    painter = painterResource(id = R.drawable.icone_usuario),
                    contentDescription = "Icone usuario",
                    contentScale = ContentScale.Fit,
                    modifier = modifier
                        .clip(CircleShape)
                        .fillMaxWidth(0.5f)
                        .align(Alignment.CenterHorizontally)
                )
                Column(modifier = modifier.fillMaxWidth(0.9f)
                    .align(Alignment.CenterHorizontally)) {
                    Row() {
                        LabelText(
                            label = "Nome: "
                        )
                        ValueText(
                            value = "Raquel Yukie Tsuji",
                            fontSize = 20.sp
                        )
                    }
                    Row() {
                        LabelText(
                            label = "Curso: "
                        )
                        ValueText(
                            value = "Desenvolvimento de Sistemas",
                            fontSize = 20.sp
                        )
                    }
                }
                QrCode(
                    conteudo = "qrcode",
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .align(Alignment.CenterHorizontally)
                )
            }
        }
    }
}