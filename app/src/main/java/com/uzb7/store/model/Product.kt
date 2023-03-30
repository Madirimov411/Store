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

@Entity(tableName = "income")
data class Income(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val productId: Int,
    val count: Double,
    val price: Double,
    val incomeDate: String
)

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

@Entity(tableName = "productType")
data class ProductType(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String
)

@Entity(tableName = "unit")
data class Unit(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String
)

@Entity(tableName = "users")
data class Users(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val personName: String,
    val userName: String,
    val password: String,
    val role: Int? = 0
)




