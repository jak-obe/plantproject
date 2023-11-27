package com.example.plantproject.navigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.plantproject.navigation.Screen

@Composable
fun HomeScreen(navController: NavController) {


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0, 204, 102))
            .height(20.dp),
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

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {


        Column(modifier = Modifier.padding(bottom = 50.dp)) {

            Button(
                onClick = {
                    navController.navigate(route = Screen.Detail.route)
                },
                colors = ButtonDefaults.buttonColors(Color.DarkGray),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(150.dp)
                    .fillMaxWidth()

            ) {
                Text("DETAIL", style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold))
            }

            Button(
                onClick = {
                    navController.navigate(route = Screen.PlantSection.route)
                },
                colors = ButtonDefaults.buttonColors(Color.DarkGray),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(150.dp)
                    .fillMaxWidth()

            ) {
                Text("Plant Section", style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold))
            }




        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewHomeScreen() {
    HomeScreen(navController = rememberNavController())
}