package com.example.tarjetapresentacion

import android.icu.text.Transliterator.Position
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(

                    color = MaterialTheme.colors.background
                ) {
                    TarjetaPresentacion(fondo = Color.Cyan)
                }
            }
        }
    }
}

@Composable
fun TarjetaPresentacion(fondo: Color) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(fondo),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        val imagen = painterResource(R.drawable.ic_launcher_foreground)
        Image(painter = imagen , contentDescription = null )
            
        Text(
            text = "Óscar Vitores",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp

        )
        Text(
            text = "Computer Engineer",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
    }
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom) {
            Row{
                val imagen2 = painterResource(R.drawable.baseline_call_black_24dp)
                Icon(painter = imagen2 , contentDescription = null,
                    Modifier
                        .size(20.dp, 20.dp)
                        .padding(end = 10.dp))
                Text(
                    text = "+34 618045683",
                    )
            }
            Row{
                val imagen3 = painterResource(R.drawable.baseline_share_black_24dp)
                Icon(painter = imagen3 , contentDescription = null,
                    Modifier
                        .size(20.dp, 20.dp)
                        .padding(end = 10.dp))
            Text(
                text = "@o.vitoores",

            )
            }
            Row {
                val imagen4= painterResource(R.drawable.baseline_email_black_24dp)
                Icon(painter = imagen4, contentDescription = null,
                    Modifier
                        .size(20.dp, 20.dp)
                        .padding(end = 10.dp))


                Text(
                    text = "vitores2002@gmail.com",
                )
            }
        }


}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    TarjetaPresentacionTheme {
        TarjetaPresentacion(fondo = Color.Cyan)
    }
}