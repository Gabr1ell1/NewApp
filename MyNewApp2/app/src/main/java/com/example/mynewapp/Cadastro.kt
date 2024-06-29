package com.example.mynewapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mynewapp.ui.theme.MyNewAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Cadastro(){
    //colocar os elementos da coluna mais afastados do cabeçalho
    Column(
        Modifier
            .background(Color.White)
            .padding(18.dp)
            .fillMaxWidth(), //A coluna deve ocupar toda a largura disponível do contêiner pai(tela).
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //CABEÇALHO
        Row(
            Modifier
                .padding(18.dp)
                .fillMaxWidth(),
            Arrangement.Center

        ) {
            Text(text = "Mary's Shoes",
                style = TextStyle(
                    fontFamily = FontFamily.Serif,
                    fontSize = 24.sp
                )
            )
        }
        //NOME
        Row(
            Modifier
                .padding(18.dp), // Adicionando um espaço de 8 pixels em todas as direções da linha.
            Arrangement.Start

        ) {
            var nome by remember { mutableStateOf("") }
            OutlinedTextField(
                value = nome,
                onValueChange = { nome = it },
                label = {
                    Text("Nome")},
                //CAMPO COM LINHA ÚNICA
                singleLine = true

            )
        }
        //EMAIL
        Row(
            Modifier
                .padding(18.dp), // Adicionando um espaço de 8 pixels em todas as direções da linha.
            Arrangement.Start

        ) {
            var email by remember { mutableStateOf("") }
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = {
                    Text("Email")},
                //CAMPO COM LINHA ÚNICA
                singleLine = true
            )
        }
        //SENHA
        Row(
            Modifier
                .padding(18.dp), // Adicionando um espaço de 8 pixels em todas as direções da linha.
            Arrangement.Start

        ) {
            var senha by remember { mutableStateOf("") }
            OutlinedTextField(
                value = senha,
                onValueChange = { senha = it },
                label = {
                    Text("Senha")},
                //CAMPO COM LINHA ÚNICA
                singleLine = true,
                //MASCARANDO A SENHA DIGITADA
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            )
        }
        Row(
            Modifier
                .padding(18.dp), // Adicionando um espaço de 8 pixels em todas as direções da linha.
            Arrangement.Start

        ) {
            //deixar a fonte azul e sublinhada
            Text(text = "Esqueceu a senha?",
                style = TextStyle(
                    textDecoration = TextDecoration.Underline,
                    color = Color.Blue,
                    fontFamily = FontFamily.Serif,
                    fontSize = 14.sp,
                )
            )
        }
        //BOTÃO
        Row(
            Modifier
                .fillMaxWidth(), //A linha deve ocupar toda a largura disponível do contêiner pai(tela).
            Arrangement.Center // Alinha os elementos da linha absolutamente à direita dentro do espaço disponível.
        ) {
            Button(
                onClick = { /*TODO*/ } // Define a ação a ser executada quando o botão for clicado.

            ) {
                Text(text = "Entrar",// Definindo o texto que será exibido dentro do botão.
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                )
            }
        }



    }
}//FIM DA FUNÇÃO Cadastro

@Preview(showBackground = true)
@Composable
fun CadastroPreview() {
    MyNewAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(), // Definindo que a surface deve ocupar todo o tamanho disponível.
            color = MaterialTheme.colorScheme.background
        ) {
            Cadastro()
        }
    }
}