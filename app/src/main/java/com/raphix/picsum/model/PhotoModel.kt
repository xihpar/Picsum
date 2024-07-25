package com.raphix.picsum.model

import kotlinx.serialization.Serializable

@Serializable
data class PhotoModel(
    val id: String,
    val author: String,
    val width: Int,
    val height: Int,
    val url: String,
    val download_url: String
)