package com.uzb7.store.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "income")
data class Income(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val productId: Int,
    val count: Double,
    val price: Double,
    val incomeDate: String
)