package com.alpha.roomapplication.db.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student(

    @PrimaryKey(autoGenerate = true)
    val studentId: Long = 0L,

    val firstName: String = "",

    val lastName: String = "",

    /*@Embedded
    @Embedded can be used to add one to many relations
    @Embedded will add 2 more columns to Student table- address_streetName, address_streetNumber

    Issue with @Embedded is data integrity. There is no way to enforce data integrity.
    If 2 students having same address, we cant enforce that change in one's address should change
    other also. So there will be a mismatch, if don't handled properly
    * */

    @Embedded(prefix = "address_")
    val address: Address? = null

)

data class Address(
    val streetName: String = "",
    val streetNumber: String = ""
)
