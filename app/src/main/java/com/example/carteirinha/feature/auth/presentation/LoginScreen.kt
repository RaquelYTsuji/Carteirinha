package com.example.carteirinha.feature.auth.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteirinha.R
import com.example.carteirinha.core.designsystem.theme.AppTheme

@Composable
fun LoginScreen(modifier: Modifier = Modifier){
    Box(
        modifier = modifier.fillMaxSize()
            .background(brush = Brush.verticalGradient(
                colors = listOf(
                    MaterialTheme.colorScheme.error,
                    MaterialTheme.colorScheme.onError
                )
            )),
        contentAlignment = Alignment.Center
    ) {
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
            modifier = Modifier.fillMaxSize(0.8f)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
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
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Login") }
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Senha") }
                )
                Button(
                    onClick = {},
                    modifier = Modifier.size(
                        width = 100.dp,
                        height = 48.dp
                    ),
                    shape = RoundedCornerShape(
                        size = 10.dp
                    ),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary
                    )
                ) {
                    Text("Entrar")
                }
            }
        }
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLoginClaro(){
    AppTheme(darkTheme = false){
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            LoginScreen(
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
fun PreviewCarteirinhaLoginEscuro(){
    AppTheme(darkTheme = true){
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            LoginScreen(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}