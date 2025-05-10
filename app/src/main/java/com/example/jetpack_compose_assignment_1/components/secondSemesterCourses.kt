package com.example.jetpack_compose_assignment_1.components

import com.example.jetpack_compose_assignment_1.Course

fun secondSemesterCourses(): List<Course> {
    return listOf(
        Course(
            "Computer Graphics",
            "SECT-3132",
            3,
            "Graphics rendering principles",
            "Discrete Mathematics, Data Structures & Algorithms"
        ),
        Course(
            "Fundamentals of AI",
            "SECT-3151",
            2,
            "Introduction to AI techniques",
            "Discrete Mathematics, Probability & Statistics, Data Structures & Algorithms"
        ),
        Course(
            "Fundamentals of Cybersecurity",
            "SECT-3141",
            2,
            "Cybersecurity concepts",
            "Computer Networks, Programming Fundamentals"
        ),
        Course(
            "Mobile Application Development",
            "SECT-3113",
            3,
            "Building mobile applications",
            "Web Design and Programming,"
        ),
        Course(
            "Operating Systems and System Programming",
            "SECT-3082",
            3,
            "OS fundamentals and system coding",
            "Computer Architecture, Data Structures & Algorithms"
        )
    )
}

