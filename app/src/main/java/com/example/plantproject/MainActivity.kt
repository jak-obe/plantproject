package com.example.plantproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.plantproject.navigation.SetupNavGraph
import com.example.plantproject.ui.theme.PlantprojectTheme
import com.example.plantproject.viewModels.apiViewModel

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController
    lateinit var mojviewmodel: apiViewModel
//    mojviewmodel = apiViewModel()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlantprojectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    navController = rememberNavController()
                    SetupNavGraph(navController = navController,mojviewmodel )
                }
            }
        }
    }
}

