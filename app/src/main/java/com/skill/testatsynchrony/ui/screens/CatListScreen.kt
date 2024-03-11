package com.skill.testatsynchrony.ui.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.skill.testatsynchrony.models.CatResponse
import com.skill.testatsynchrony.viewModel.CatViewModel

@Composable
fun CatListScreen(navController: NavHostController) {
    CatList()
}

@Composable
fun CatList() {
    val context = LocalContext.current
    val viewModel: CatViewModel = viewModel()
    val catList by viewModel.catList.collectAsState()
    val lazyListState = rememberLazyListState()

    LaunchedEffect(Unit) {
        Log.d("kajal", "LaunchedEffect bef: ")
        viewModel.getCats(lazyListState)
        Log.d("kajal", "LaunchedEffect aft: ")

    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        state = lazyListState
    ) {
        Log.d("kajal", "state: ")
        items(catList) { cat ->
            CatListItem(cat = cat)
        }
    }
}

@Composable
fun CatListItem(cat: CatResponse) {
    Card(
        modifier = Modifier
            .height(250.dp)
            .fillMaxWidth()
            .background(Color.Black)
            .padding(horizontal = 4.dp, vertical = 4.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
        shape = RoundedCornerShape(3.dp),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .width(0.dp)
                .height(0.dp)
                .weight(0.7f) // Set the image height to 70% of the Card's height
        ) {
            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Text(text = "ID: ${cat.id}", style = MaterialTheme.typography.bodyLarge)
                AsyncImage(
                    model = cat.url,
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .fillMaxHeight(1f),
                    contentDescription = null,
                )
            }
        }
    }
}
