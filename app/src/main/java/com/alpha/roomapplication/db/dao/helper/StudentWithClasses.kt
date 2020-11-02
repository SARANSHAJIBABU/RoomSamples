package com.alpha.roomapplication.db.dao.helper

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.alpha.roomapplication.db.entity.Class
import com.alpha.roomapplication.db.entity.ClassEnrollments
import com.alpha.roomapplication.db.entity.Student

data class StudentWithClasses(

    @Embedded
    val student: Student,

    @Relation(
        parentColumn = "studentId",
        entityColumn = "classId",

        /*Since parentColumn & entityColumn are not directly related
        * We need to mention the association using Joining table
        * */
        associateBy = Junction(value = ClassEnrollments::class)
    )
    val classes: List<Class>
)
