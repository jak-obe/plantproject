package com.example.plantproject.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PlantCard(id: Int, name: String,temperatura: Int, wilgotnosc: Int, swiatlo: Int) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = MaterialTheme.shapes.medium,


    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(Modifier.padding(8.dp)) {
                Row(Modifier.padding(8.dp)){
                    Text(
                        text = "id: ${id.toString()}",
                    )
                    Text(
                        text = " ${name}",
                    )}
                Row(Modifier.padding(8.dp)) {


                    Text(text = "T: ${temperatura} ")
                    Text(text = "W: ${wilgotnosc} ")
                    Text(text = "Ś: ${swiatlo} ")
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewPlantCard(){
    PlantCard(id = 5, name = "marek", temperatura = 3, wilgotnosc = 2, swiatlo = 1)
}