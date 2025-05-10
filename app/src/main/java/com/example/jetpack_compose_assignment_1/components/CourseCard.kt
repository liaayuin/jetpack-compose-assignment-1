package com.example.jetpack_compose_assignment_1.components

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_assignment_1.Course
import com.example.jetpack_compose_assignment_1.primaryColor

@Composable
fun CourseCard(course: Course) {
    var isExpanded by rememberSaveable { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { isExpanded = !isExpanded }
            .animateContentSize(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = course.title,
                    style = MaterialTheme.typography.headlineSmall,
                    color = primaryColor,
                    modifier = Modifier.fillMaxWidth().padding(end = 40.dp)
                )

                Icon(
                    imageVector = if (isExpanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                    contentDescription = if (isExpanded) "Collapse" else "Expand",
                    tint = primaryColor,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(top = 4.dp, end = 4.dp)
                        .clickable { isExpanded = !isExpanded }
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row {
                Text(text = "Code: ", style = MaterialTheme.typography.titleSmall)
                Text(text = course.code, style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "Credits: ", style = MaterialTheme.typography.titleSmall)
                Text(text = course.creditHours.toString(), style = MaterialTheme.typography.bodyMedium)
            }

            if (isExpanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Description:", style = MaterialTheme.typography.titleSmall)
                Text(text = course.description, style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Prerequisites:", style = MaterialTheme.typography.titleSmall)
                Text(text = course.prerequisites, style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}