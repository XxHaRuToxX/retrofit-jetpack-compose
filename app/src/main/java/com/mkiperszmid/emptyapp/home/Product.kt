package com.mkiperszmid.emptyapp.home

import androidx.room.PrimaryKey
import com.squareup.moshi.Json

data class Product(
    @field:Json(name = "_id")
//    val id: String? = null, Una opcion si en caso ya genera id el api
    val id: String,
    @field:Json(name = "name")
    val name: String,
    @field:Json(name = "price")
    val price: Double
)

//    Otra opcion si en caso ya genera id el api sin el ID
data class ProductDto(
    @field:Json(name = "name")
    val name: String,
    @field:Json(name = "price")
    val price: Double
)
