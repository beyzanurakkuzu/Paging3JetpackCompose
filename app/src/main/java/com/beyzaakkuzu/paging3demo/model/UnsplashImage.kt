package com.beyzaakkuzu.paging3demo.model

import androidx.room.Entity


@Entity
data class UnsplashImage(
    val id:String,
    val urls: Urls,
    val likes: Int,
    val user:User
)
