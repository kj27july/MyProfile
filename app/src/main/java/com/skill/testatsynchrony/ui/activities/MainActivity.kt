package com.skill.testatsynchrony.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.skill.testatsynchrony.ui.composables.Navigation
import com.skill.testatsynchrony.ui.composables.NavigationBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                Main()
            }
        }
    }
}

@Composable
fun Main() {
    val navController = rememberNavController()
    Scaffold(
        topBar = { NavigationBar(navController = navController) }
    ) {
        it.calculateTopPadding()
        Navigation(navController = navController)
    }
}