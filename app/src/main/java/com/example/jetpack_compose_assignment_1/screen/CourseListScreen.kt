package com.example.jetpack_compose_assignment_1.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_assignment_1.Course
import com.example.jetpack_compose_assignment_1.components.CourseCard


@Composable
fun CourseListScreen(firstSemesterCourses: List<Course>, secondSemesterCourses: List<Course>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .padding(8.dp)
    ) {
        item {
            Text(
                text = "1st Semester Courses",
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(36.dp),
                color = MaterialTheme.colorScheme.primary
            )
        }
        items(firstSemesterCourses) { course ->
            CourseCard(course = course)
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "2nd Semester Courses",
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(16.dp),
                color = MaterialTheme.colorScheme.primary
            )
        }
        items(secondSemesterCourses) { course ->
            CourseCard(course = course)
        }
    }
}

