package com.example.plantproject.navigation.screens

import android.util.Log
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.plantproject.data.PlantData
import com.example.plantproject.navigation.Screen
import com.example.plantproject.viewModels.apiViewModel
import java.io.File


@Composable
fun HomeScreen(navController: NavController, apiViewModel: apiViewModel) {



    val marek = PlantData("imie","imieLacinskie","opisik")

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0, 204, 102))
            .height(20.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.padding(5.dp)) {
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
        modifier = Modifier.fillMaxSize().background(color = Color.Transparent).height(10000.dp),
        contentAlignment = Alignment.Center,

    ) {


        Column(modifier = Modifier.padding(bottom = 50.dp)) {



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
                Text("Podgląd", style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold))
            }


            Button(
                onClick = {
                    Log.d("plancik", "klikfront")

                    apiViewModel.postDataWithoutPhoto(marek)

                },
                colors = ButtonDefaults.buttonColors(Color.DarkGray),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(150.dp)
                    .fillMaxWidth()

            ) {
                Text("WYSLIJ ROSLINKE  :))))", style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold))
            }



        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewHomeScreen() {
//    HomeScreen(navController = rememberNavController())
}