package com.skill.testatsynchrony.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileEducationDetails() {
    Column(
        modifier = Modifier
            .padding(top = 10.dp)
            .border(3.dp, Color.Gray)
            .background(Color.Gray)
    )
    {
        Text(
            text = "Education",
            color = Color.Black,
            modifier = Modifier.padding(10.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            style = MaterialTheme.typography.bodyLarge
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(10.dp)
        )
        {
            educationDetailsItems.forEach { educationDetailsItems ->
                ProfileEducationDetailsItem(educationDetailsItems)
            }
        }
    }
}