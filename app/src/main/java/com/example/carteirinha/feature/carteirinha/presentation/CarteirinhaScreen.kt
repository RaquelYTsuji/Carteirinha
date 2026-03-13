package com.example.carteirinha.feature.carteirinha.presentation

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
fun CarteirinhaScreen(modifier: Modifier = Modifier) {
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
                .graphicsLayer(alpha = 0.3f),
            contentScale = ContentScale.Crop
        )
        Card (
            shape = RoundedCornerShape(10),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.background
            ),
            modifier = Modifier.fillMaxSize(0.9f)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(
                    space = 16.dp,
                    alignment = Alignment.CenterVertically
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_senai),
                    contentDescription = "Logo do senai",
                    modifier = Modifier.fillMaxWidth(0.9f)
                        .align(Alignment.CenterHorizontally)
                )
                Image(
                    painter = painterResource(id = R.drawable.icone_usuario),
                    contentDescription = "Icone usuario",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .clip(CircleShape)
                        .fillMaxWidth(0.5f)
                        .align(Alignment.CenterHorizontally)
                )
                Column(modifier = Modifier.fillMaxWidth(0.9f)
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

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewCarteirinhaClaro(){
    AppTheme(darkTheme = false){
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            CarteirinhaScreen(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewCarteirinhaEscuro(){
    AppTheme(darkTheme = true){
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            CarteirinhaScreen(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}