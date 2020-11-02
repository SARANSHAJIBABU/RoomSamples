package com.alpha.roomapplication.db.dao.helper

import androidx.room.Embedded
import androidx.room.Relation
import com.alpha.roomapplication.db.entity.Student
import com.alpha.roomapplication.db.entity.Vehicle

/*
* While querying one to many, in sql, we need to join one entity with other
* With room we can create a model to hold result and annotate them with @Embedded & @Relation
* */
data class StudentWithVehicles(

    //@Embedded tells queried result of Student from dao is placed in StudentWithVehicles model
    @Embedded
    val student: Student,

    //@Relation establish join link between studentId and ownerId and returns list of vehicles
    // matching that
    @Relation(
        parentColumn = "studentId",
        entityColumn = "ownerId"
    )
    val vehicles: List<Vehicle>
)
