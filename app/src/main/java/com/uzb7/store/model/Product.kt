package com.uzb7.store.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "product")
data class Product(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val productTypeId: Int,
    val productName: String,
    val unitId: Int,
    val price: Double
)
