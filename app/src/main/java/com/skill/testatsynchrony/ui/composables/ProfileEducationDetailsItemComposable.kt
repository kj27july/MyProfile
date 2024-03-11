package com.skill.testatsynchrony.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skill.testatsynchrony.models.EducationDetail

@Composable
fun ProfileEducationDetailsItem(educationDetail: EducationDetail) {
    var expanded by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
            .background(Color.Gray)
            .clickable { expanded = !expanded } // Toggle visibility on click
    ) {
        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = educationDetail.course,
                color = Color.Black,
                modifier = Modifier.padding(4.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
            )

            Icon(
                imageVector = if (expanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                contentDescription = "Toggle",
                tint = Color.Black,
                modifier = Modifier.padding(4.dp)
            )
        }

        Divider(color = Color.Black, thickness = 1.dp)

        if (expanded) {
            Text(
                text = educationDetail.collage,
                color = Color.Black,
                modifier = Modifier.padding(8.dp),
                fontSize = 18.sp,
            )
            Text(
                text = educationDetail.duration,
                color = Color.Black,
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = educationDetail.marks,
                color = Color.Black,
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

val educationDetailsItems = listOf(
    EducationDetail(
        "Master of Computer Applications",
        "Cochin University of Science and Technology, Kochi",
        "2018-2021",
        "CGPA: 9.57"
    ),
    EducationDetail(
        "Bachelor of Computer Applications",
        "Patna Women's College, Patna",
        "2015-2018",
        "Percentage: 84%"
    ),
    EducationDetail(
        "Intermediate", "J.E.M.H.S School, Anuppur (M.P)", "2015", "Percentage: 76%"
    ),
    EducationDetail(
        "Matriculation", "J.E.M.H.S School, Anuppur (M.P)", "2013", "Percentage: 85%"
    )
)