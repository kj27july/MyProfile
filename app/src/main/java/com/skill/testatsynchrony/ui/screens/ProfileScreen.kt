package com.skill.testatsynchrony.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.skill.testatsynchrony.ui.composables.ProfileEducationDetails
import com.skill.testatsynchrony.ui.composables.ProfileHeader
import com.skill.testatsynchrony.ui.composables.ProfileWorkExperience

@Composable
fun ProfileScreen(onNavigateToCatList: () -> Unit) {

    LazyColumn {
        item {
            ProfileHeader()
        }
        item {
            ProfileWorkExperience()
        }
        item {
            ProfileEducationDetails()
        }
    }
}