package com.example.praktikum3

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Layout(modifier: Modifier = Modifier){
    Column ( modifier = modifier.fillMaxSize() ){
        tampilanHeader()
        DetailMahasiswa(
            judul = "Nama", isinya = "Farhan"
        )
        DetailMahasiswa(
            judul = "NIM", isinya = "2020"
        )

    }
}

@Composable
fun tampilanHeader() {
    Box(modifier = Modifier.fillMaxWidth().background(Color.Gray)) {
        Row {
            Box(
                contentAlignment = Alignment.BottomEnd
            ) {
                Image(
                    painterResource(R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Icon(
                    Icons.Default.Done, contentDescription = null,
                    modifier = Modifier.size(28.dp)
                        .background(color = Color.Blue,
                            shape = CircleShape),
                    tint = Color.Red
                )
            }
            Column (modifier = Modifier.padding(16.dp)){
                Text(text = "Teknologi Informasi",
                    color = Color.Yellow,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier.padding(3.dp))
                Text(text = "Universitas Muhammadiyah Yogyakarta",
                    color = Color.Yellow,
                    fontSize = 17.sp)

             }
        }
    }
}

@Composable
fun  DetailMahasiswa(
    judul:String,
    isinya:String
){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween){
        Text(judul, modifier = Modifier.weight(0.8f))
        Text(":", modifier = Modifier.weight(0.2f))
        Text(isinya, modifier = Modifier.weight(2f))
    }
}


