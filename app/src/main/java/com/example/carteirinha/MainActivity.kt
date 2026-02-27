package com.example.carteirinha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carteirinha.ui.theme.AppTheme
import com.rafaelcosta.myapplication.QrCode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Carteirinha(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun Carteirinha(modifier: Modifier = Modifier) {
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
        //backgorund
        Card(
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
                        Text(
                            text = "Nome: ",
                            style = MaterialTheme.typography.titleLarge,
                            color = MaterialTheme.colorScheme.error
                        )
                        Text(
                            text = "Raquel Yukie Tsuji",
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                    Row() {
                        Text(
                            text = "Curso: ",
                            style = MaterialTheme.typography.titleLarge,
                            color = MaterialTheme.colorScheme.error
                        )
                        Text(
                            text = "Desenvolvimento de Sistemas",
                            style = MaterialTheme.typography.bodyLarge
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

//preview