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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skill.testatsynchrony.models.WorkExperience

@Composable
fun ProfileWorkExperienceItem(workExperience: WorkExperience) {
    var expanded by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
            .background(Color.Gray)
            .clickable { expanded = !expanded }
    ) {
        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = workExperience.designation,
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
                text = workExperience.duration,
                color = Color.Black,
                fontStyle = FontStyle.Italic,
                modifier = Modifier.padding(8.dp),
                fontSize = 18.sp,
            )
            Text(
                text = workExperience.workedOn,
                color = Color.Black,
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}


val profileItems = listOf(
    WorkExperience(
        "Software Developer - 1 (SOTI Inc)", "Aug 2022 - Present", "- Jetpack Compose for UI.\n" +
                "- RESTful APIs, JSON, Retrofit.\n" +
                "- Dagger 2, Hilt, Koin, Guice DI.\n" +
                "- JUnit, Mockito, MockK, Espresso.\n" +
                "- Offline Storage, Threading, and Coroutines.\n" +
                "- Mobile Device Management (MDM) Solution."
    ),
    WorkExperience(
        "Associate Software Developer (SOTI Inc))",
        "Aug 2021- July 2022",
        "- Expertise in Kotlin and Android SDK.\n" +
                "- Architectural pattern: MVP, MVC, MVVM, MVI.\n" +
                "- Put hands on AIDL and created data sharing library.\n" +
                "- UI Design: XML layouts, Material Design, Responsive UI.\n" +
                "- Completely managed to implement API of different OEMs\n" +
                "such as Zebra, Bluebird, Honeywell, Panasonic, etc."
    ),
    WorkExperience(
        "Software Developer Intern (SOTI Inc)",
        "Feb 2021 - July 2021",
        "- Developed a dynamic web application.\n" +
                "- Angular, .NET, HTML, CSS."
    )

)