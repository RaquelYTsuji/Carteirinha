package com.example.carteirinha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
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
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun Carteirinha(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween) {

        Image(
            painter = painterResource(id = R.drawable.logo_senai),
            contentDescription = "Logo do senai"
        )
        Image(
            painter = painterResource(id = R.drawable.icone_usuario),
            contentDescription = "Icone usuario",
            modifier = modifier.clip(CircleShape)
        )
        Row() {
            Text(
                text = "Nome: ",
                modifier = modifier
            )
            Text(
                text = "Nome Sobrenome",
                modifier = modifier
            )
        }
        Row() {
            Text(
                text = "Curso: ",
                modifier = modifier
            )
            Text(
                text = "Android",
                modifier = modifier
            )
        }
        QrCode(
            conteudo = "qrcode"
        )
    }

}