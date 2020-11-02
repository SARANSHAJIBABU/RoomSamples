package com.alpha.roomapplication.db.dao.helper

import androidx.room.Embedded
import androidx.room.Relation
import com.alpha.roomapplication.db.entity.Application
import com.alpha.roomapplication.db.entity.Student

data class StudentWithApplication(
    @Embedded
    val student: Student,

    @Relation(
        parentColumn = "studentId",
        entityColumn = "studentId"
    )
    val application: Application  //Not application is non null. If no application found, query breaks
)
