package com.uzb7.store.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "outcome")
data class Outcome(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val productId: Int,
    val count: Double,
    val price: Double,
    val note: String? = null,
    val outcomeDate: String,
    val userId: Int
)