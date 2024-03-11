package com.skill.testatsynchrony.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skill.testatsynchrony.R

@Composable
fun ProfileHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Gray)
            .padding(top = 50.dp, bottom = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Absolute.Center
    ) {
        Column(
            modifier = Modifier
                .weight(.7f)
                .padding(10.dp, top = 20.dp)

        ) {
            Text(
                text = "Kajal Gupta",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 24.sp,
            )
            Text(
                text = "Software Developer",
                color = Color.Black,
                style = MaterialTheme.typography.bodyLarge,

                )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Absolute.Center,
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_call_24),
                    contentDescription = null
                )
                Text(text = "6291-477-355", Modifier.padding(start = 5.dp))
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Absolute.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_attach_email_24),
                    contentDescription = null
                )
                Text(text = "kj27july@gmail.com", Modifier.padding(start = 5.dp))
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Absolute.Center,
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.baseline_location_on_24),
                    contentDescription = null
                )
                Text(text = "Bengaluru", Modifier.padding(start = 5.dp))
            }
        }
        Image(
            painter = painterResource(id = R.drawable.kj_profile_pic),
            contentDescription = null,
            modifier = Modifier
                .wrapContentSize()
                .padding(10.dp)
                .weight(.3f)
                .border(3.dp, Color.Black)
                .align(Alignment.CenterVertically)
        )
    }
}