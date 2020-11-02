package com.alpha.roomapplication.db.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity
data class Class(
    @PrimaryKey(autoGenerate = true)
    val classId: Long = 0L,
    val name: String
)

@Entity(
    primaryKeys = ["studentId","classId"],
    foreignKeys = [
        ForeignKey(
            entity = Student::class,
            parentColumns = ["studentId"],
            childColumns = ["studentId"]
        ),
        ForeignKey(
            entity = Class::class,
            parentColumns = ["classId"],
            childColumns = ["classId"]
        )
    ]
)
data class ClassEnrollments(
    val studentId: Long,
    val classId: Long
)
