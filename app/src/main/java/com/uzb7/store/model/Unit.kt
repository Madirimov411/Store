package com.uzb7.store.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "unit")
data class Unit(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String
)