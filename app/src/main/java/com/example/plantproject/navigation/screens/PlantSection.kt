package com.example.plantproject.navigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.plantproject.composables.PlantCard
import com.example.plantproject.data.Plant
import com.example.plantproject.data.plants

@Composable
fun PlantSection(navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0, 204, 102))
            .height(120.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(
                textAlign = TextAlign.Center,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                style = TextStyle(color = Color.White),
                text = "PlantWatch"
            )
        }
    }
    ListaRoslin(platList = plants)
}


@Composable
fun ListaRoslin(platList: List<Plant>) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp)
    ) {
        item {
            Row(modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(vertical = 25.dp)) {
                Text(
                    "\uD83C\uDF3F  Plants in Cosmetics",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
        items(platList){plant ->
            PlantCard(plant.id,plant.name)
        }
    }
}

@Preview
@Composable
fun previewPlantSection(){
    PlantSection(navController = rememberNavController())
}



@Preview
@Composable
fun previewListaRoslin(){
    ListaRoslin(platList = plants)
}
