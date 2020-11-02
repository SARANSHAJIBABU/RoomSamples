package com.alpha.roomapplication.db.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Student::class,
            parentColumns = ["studentId"],
            childColumns = ["studentId"]
        )
    ],
    /*To enforce one to one relation*/
    indices = [Index(value = ["studentId"], unique = true)]
)
data class Application(
    @PrimaryKey(autoGenerate = true)
    val applicationId: Long = 0L,

    val studentId: Long = 0L,

    val applicationText: String = ""
)
