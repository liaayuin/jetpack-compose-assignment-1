package com.example.jetpack_compose_assignment_1.components

import com.example.jetpack_compose_assignment_1.Course


fun firstSemesterCourses(): List<Course> {
    return listOf(
        Course(
            "Computer Organizations and Architecture",
            "SECT-3122",
            5,
            "Hardware concepts",
            "Basic Programming"
        ),
        Course(
            "Fundamentals of Electrical Circuits and Electronics",
            "SECT-2121",
            2,
            "Basic electronic components",
            "None"
        ),
        Course(
            "Fundamentals of Software Engineering",
            "SECT-2111",
            3,
            "Software development principles",
            "Object-Oriented Program, Data Structures & Algorithms"
        ),
        Course(
            "Human-Computer Interaction",
            "SECT-3131",
            3,
            "User-friendly interface design",
            "None"
        ),
        Course(
            "Web Design and Programming",
            "SECT-3112",
            4,
            "Web development technologies",
            "Fundamental of networking"
        )
    )
}
