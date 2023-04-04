package com.uzb7.store.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "productType")
data class ProductType(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String
)