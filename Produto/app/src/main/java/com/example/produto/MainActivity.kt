package com.example.mynewapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.produto.R
import com.example.produto.ui.theme.ProdutoTheme

@Composable
fun ProdutoApp() {
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
                    modifier = Modifier.size(32.dp)
                )//AUMENTANDO O TAMANHO DO ÍCONE

                Spacer(modifier = Modifier.width(25.dp)) // Espaço entre o ícone e o texto do cabeçalho
                Text(
                    text = "Mary's Shoes",
                    style = TextStyle(
                        fontFamily = FontFamily.Serif,
                        fontSize = 24.sp,
                    )
                )

                Spacer(modifier = Modifier.width(25.dp)) // Espaço flexível para empurrar o próximo ícone para a direita
//Segundo icone
                Icon(
                    imageVector = Icons.Filled.AccountCircle, contentDescription = "Account Icon",
                    modifier = Modifier.size(32.dp),
                )
            }
        }

        item {
//fun de rolagem de imagens

            Rolagem(
                modifier = Modifier
                    .fillMaxWidth()
            )
        }

        item {
            //Texto
            Row(
                Modifier
                    .padding(18.dp)
                    .fillMaxWidth(),

                ) {

                Text(
                    text = "Tênis adidas Lite Racer 3.0 - Masculino - Preto",
                    style = TextStyle(
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 17.sp
                    )
                )
            }
        }
        item {
            //Texto
            Row(
                Modifier
                    .padding(18.dp)
                    .fillMaxWidth(),

                ) {

                Text(
                    text = "Descrição",
                    style = TextStyle(
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                )
            }
        }
        item {
            Row(
                Modifier
                    .padding(18.dp)
                    .fillMaxWidth(),
            ) {

                Text(
                    text = "Autenticidade adidas e conforto para o dia a dia. O Tênis Lite Racer 3 0 Masculino pode ser o seu novo tênis casual favorito. Ele garante comodidade aos pés, maciez e versatilidade para suas combinações urbanas com toque esportivo. Não é recomendado praticar atividades físicas com ele. Seu cabedal é respirável, com forro acolchoado e traz as três listras icônicas da marca. Além disso, é de peso leve e com excelente custo-benefício, redução de costuras e calce facilitado. Para acompanhar, as peças vão da calça jeans masculina à calça jogger, assim como bermuda masculina e sua camiseta masculina adidas preferida. Peça já o seu e aproveite!",
                    style = TextStyle(
                        fontFamily = FontFamily.Default,
                        fontSize = 15.sp
                    )
                )
            }
        }

        item {
            Row(
                Modifier
                    .padding(18.dp)
                    .fillMaxWidth(),
            ) {
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "Star Icon",//O ícone faz parte do conjunto de ícones disponíveis  pelo Jetpack Compose na biblioteca material3.
                    modifier = Modifier.size(20.dp)//AUMENTANDO O TAMANHO DO ÍCONE
                )
                Text(
                    text = "Avaliações >",
                    style = TextStyle(
                        color = Color.Blue,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                )
            }
        }

    }//FIM DA COLUNA
}//FIM FA FUN

@Composable
fun Rolagem(modifier: Modifier = Modifier) {
    var selectedtenis by remember { mutableStateOf("") }
    val context = LocalContext.current

    val TenisImageResource = when (selectedtenis) {
        "ADIDAS 1" -> R.drawable.adidas1
        "ADIDAS 2" -> R.drawable.adidas2
        "ADIDAS 3" -> R.drawable.adidas3
        "ADIDAS 4" -> R.drawable.adidas4
        else -> R.drawable.adidas5
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(TenisImageResource),
            contentDescription = selectedtenis,
            modifier = Modifier
                .fillMaxWidth()//PREENCHE TODA A LAUGORA DISPONÍVEL
                .aspectRatio(1f)//proporção quadrada para imagem
                .padding(13.dp)
        )


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
fun ProdutoAppPreview() {
    ProdutoTheme {
        Surface(
            modifier = Modifier.fillMaxSize(), // Definindo que a surface deve ocupar todo o tamanho disponível.
            color = MaterialTheme.colorScheme.background
        ) {
            ProdutoApp()
        }
    }
}