package com.example.mynewapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mynewapp.ui.theme.MyNewAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TelaApp()
                }
            }
        }
    }
}

@Composable
fun TelaApp() {
    LazyColumn(
        Modifier
            .background(Color.White)
            .fillMaxWidth(), //A coluna deve ocupar toda a largura disponível do contêiner pai(tela).

    ) {
        item {
            //CABEÇALHO
            Row(
                Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween // Alinha os itens de forma que haja espaço entre eles

            ) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Menu Icon",//O ícone faz parte do conjunto de ícones disponíveis  pelo Jetpack Compose na biblioteca material3.
                    modifier = Modifier.size(32.dp)//AUMENTANDO O TAMANHO DO ÍCONE
                )
                Spacer(modifier = Modifier.width(25.dp)) // Espaço entre o ícone e o texto do cabeçalho
                Text(
                    text = "Mary's Shoes",
                    style = TextStyle(
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 24.sp
                    )
                )
                Spacer(modifier = Modifier.width(32.dp)) // Espaço flexível para empurrar o próximo ícone para a direita
//Segundo icone
                Icon(
                    imageVector = Icons.Filled.AccountCircle, contentDescription = "Account Icon",
                    modifier = Modifier.size(32.dp),
                )
            }

//TITULO
            Row(
                Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
            ) {

                Text(
                    text = "Tênis Adidas na Mary's Shoes em promoção, Entrega Rápida. Confira as regras!",
                    style = TextStyle(
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp
                    )
                )
            }
        }
        item {
            //fun de rolagem de imagens
            TenisRolagem(
                modifier = Modifier
                    .fillMaxWidth()
            )
        }


        item {
//SUBTITULO
            Row(
                Modifier
                    .padding(15.dp)
                    .fillMaxWidth(),
            ) {

                Text(
                    text = "Navegue por outras categorias:",
                    style = TextStyle(
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 17.sp
                    )
                )
            }
            Spacer(
                modifier = Modifier
                    .height(30.dp)//espaçamento entre o subtítulo e o card
            )

        }

        item {
            Card  (modifier = Modifier
                    .padding(8.dp) // Espaçamento interno dentro do Card
                .size(120.dp) // Tamanho do Card
            ) {
                Row {
                    Box (
                        modifier = Modifier
                            .fillMaxSize() // Preenche o espaço disponível dentro do Card
                    ){

                        // Exibe a imagem do tópico
                        Image(
                            painter = painterResource(id = R.drawable.basquete),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(1f),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
            }
        }

        item {
            Card  (modifier = Modifier
                .padding(8.dp) // Espaçamento interno dentro do Card
                .size(120.dp) // Tamanho do Card
            ) {
                Row {
                    Box (
                        modifier = Modifier
                            .fillMaxSize() // Preenche o espaço disponível dentro do Card
                    ){

                        // Exibe a imagem do tópico
                        Image(
                            painter = painterResource(id = R.drawable.corrida),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(1f),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
            }
        }

        item {
            Card  (modifier = Modifier
                .padding(8.dp) // Espaçamento interno dentro do Card
                .size(120.dp) // Tamanho do Card
            ) {
                Row {
                    Box (
                        modifier = Modifier
                            .fillMaxSize() // Preenche o espaço disponível dentro do Card
                    ){

                        // Exibe a imagem do tópico
                        Image(
                            painter = painterResource(id = R.drawable.futebol),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(1f),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
            }
        }

        item {
            Card  (modifier = Modifier
                .padding(8.dp) // Espaçamento interno dentro do Card
                .size(120.dp) // Tamanho do Card
            ) {
                Row {
                    Box (
                        modifier = Modifier
                            .fillMaxSize() // Preenche o espaço disponível dentro do Card
                    ){

                        // Exibe a imagem do tópico
                        Image(
                            painter = painterResource(id = R.drawable.volei),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(1f),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
            }
        }


    }//FIM DA COLUNA
}//FIM FA FUN

@Composable
fun TenisRolagem(modifier: Modifier = Modifier) {
    var selectedtenis by remember { mutableStateOf("") }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(
                when (selectedtenis) {
                    "Tenis 1" -> R.drawable.tenis1
                    "Tenis 2" -> R.drawable.tenis2
                    "Tenis 3" -> R.drawable.tenis3
                    "Tenis 4" -> R.drawable.tenis4
                    else -> R.drawable.tenis1
                }
            ),
            contentDescription = "tenis selecinado",
            modifier = Modifier
                .fillMaxWidth()//PREENCHE TODA A LAUGORA DISPONÍVEL
                .aspectRatio(1f)//proporção quadrada para imagem
                .padding(13.dp)
        )
        //SUBTITULO
        Row(
            Modifier
                .padding(18.dp)
                .fillMaxWidth(),

            ) {

            Text(
                text = "Tênis adidas Lite Racer 3.0 - Masculino",
                style = TextStyle(
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 17.sp
                )
            )
        }

        Button(
            onClick = {
                val tenisOptions = listOf("Tenis1", "tenis2", "tenis3", "tenis4")
                selectedtenis = tenisOptions.random()
            },
            ) {
            Text(text = ">")
        }
        Spacer(
            modifier = Modifier.height(18.dp)
        )

    }
}


@Preview(showBackground = true)
@Composable
fun TelaAppPreview() {
    MyNewAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(), // Definindo que a surface deve ocupar todo o tamanho disponível.
            color = MaterialTheme.colorScheme.background
        ) {
            TelaApp()
        }
    }
}