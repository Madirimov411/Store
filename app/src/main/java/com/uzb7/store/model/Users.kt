package com.uzb7.store.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class Users(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val personName: String,
    val userName: String,
    val password: String,
    val role: Int? = 0
)