package com.alpha.roomapplication.db.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

/*
* If data integrity is a concern, we should use foreign keys to enforce relation at db level
* */
@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Student::class,
            parentColumns = ["studentId"],
            childColumns = ["ownerId"]
        )
    ]
)
data class Vehicle(
    @PrimaryKey(autoGenerate = true)
    val vehicleId: Long = 0L,

    val vehicleType: String = "",

    val ownerId: Long = 0L
)
