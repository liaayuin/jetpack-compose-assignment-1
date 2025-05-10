package com.example.jetpack_compose_assignment_1.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_assignment_1.primaryColor

@Composable
fun OnboardingScreen(onNavigateToCourseList: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.surface),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Welcome 3rd Year Software Engineering Students",
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
            color = primaryColor
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = onNavigateToCourseList,
            colors = ButtonDefaults.buttonColors(containerColor = primaryColor)
        ) {
            Text("View Course List", color = MaterialTheme.colorScheme.onPrimary)
        }
    }
}
