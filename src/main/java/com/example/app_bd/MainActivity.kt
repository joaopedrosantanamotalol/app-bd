package com.example.app_bd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app_bd.ui.theme.AppbdTheme
import com.example.app_bd.ui.theme.Carandiru
import com.example.app_bd.ui.theme.Ciclone
import com.example.app_bd.ui.theme.Pink40
import com.example.app_bd.ui.theme.Purple500
import java.sql.DatabaseMetaData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppbdTheme {
                produtonItemA()

                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun produtonItemA() {

            Column (
                Modifier
                    .height(250.dp)
                    .width(200.dp)
            ) {
Box(
    modifier = Modifier
        .height(100.dp)
        .background(
            brush = Brush.horizontalGradient(
            colors = listOf(
                Carandiru, Ciclone
            )
            )
        )
        .fillMaxWidth()
){
    Image(
        painter = painterResource(id = R.drawable.artworks_yzk2wayegun9zhtt_2jpv2w_t500x500),
        contentDescription = "Descrição da imagemn",
        modifier = Modifier
            .offset(y = (50).dp)
            .clip(shape = CircleShape)
            .align(Alignment.BottomCenter)

    )
}
            }


}