package com.plcoding.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Rabbit(
    val name: String,
    val description: String,
    val imageUrl: String
)
