package com.example.jetpack_compose_assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpack_compose_assignment_1.components.firstSemesterCourses
import com.example.jetpack_compose_assignment_1.components.secondSemesterCourses
import com.example.jetpack_compose_assignment_1.screen.CourseListScreen
import com.example.jetpack_compose_assignment_1.screen.OnboardingScreen
import com.example.jetpack_compose_assignment_1.ui.theme.Jetpack_compose_assignment_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetpack_compose_assignment_1Theme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "onboarding") {
                    composable("onboarding") {
                        OnboardingScreen(onNavigateToCourseList = { navController.navigate("course list") })
                    }
                    composable("course list") {
                        CourseListScreen(
                            firstSemesterCourses = firstSemesterCourses(),
                            secondSemesterCourses = secondSemesterCourses()
                        )
                    }
                }
            }
        }
    }
}

val primaryColor = Color(0xFF007BFF)






