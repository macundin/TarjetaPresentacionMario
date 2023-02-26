package com.example.tarjetapresentacionmario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tarjetapresentacionmario.ui.theme.TarjetaPresentacionMarioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionMarioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TarjetaPresentacion()
                }
            }
        }
    }
}

@Composable
fun TarjetaPresentacion() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val img = painterResource(id = R.drawable.m_letter_transparent_background)
        Image(painter = img, contentDescription = null, modifier = Modifier
            .height(120.dp)
            .width(150.dp))
        Text(text = stringResource(R.string.minombre),color = Color.Black)
        Text(text = stringResource(R.string.title),color = Color.Black)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 70.dp)
            .padding(top = 500.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp)
        ){
            val tfn = painterResource(id = R.drawable._3552)
            Icon(painter = tfn, contentDescription = null, modifier = Modifier.padding(start = 80.dp).height(30.dp).width(40.dp),Color.Black)
            Text(text = stringResource(R.string.tlfn), modifier = Modifier.padding(start = 25.dp), color = Color.Black)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp)
        ){
            val user = painterResource(id = R.drawable.user_account_icon_145918)
            Icon(painter = user, contentDescription = null, modifier = Modifier.padding(start = 80.dp).height(30.dp).width(40.dp),Color.Black)
            Text(text = stringResource(R.string.user), modifier = Modifier.padding(start = 25.dp), color = Color.Black)

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp)
        ){
            val email = painterResource(id = R.drawable._5645)
            Icon(painter = email, contentDescription = null, modifier = Modifier.padding(start = 80.dp).height(30.dp).width(40.dp),Color.Black)
            Text(text = stringResource(R.string.correo), modifier = Modifier.padding(start = 25.dp), color = Color.Black)

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TarjetaPresentacionMarioTheme {
        Surface{
            TarjetaPresentacion()
        }

    }
}