package com.alpha.roomapplication.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.alpha.roomapplication.db.dao.helper.StudentWithApplication
import com.alpha.roomapplication.db.dao.helper.StudentWithVehicles

@Dao
interface UniversityDao {

    //@Transaction is required since multiple tables are queried to get one result
    @Query("SELECT * FROM Student")
    @Transaction
    fun fetchStudentsWithVehicles(): LiveData<List<StudentWithVehicles>>

    @Query("SELECT * FROM Student")
    @Transaction
    fun fetchStudentWithApplication(): LiveData<List<StudentWithApplication>>
}
