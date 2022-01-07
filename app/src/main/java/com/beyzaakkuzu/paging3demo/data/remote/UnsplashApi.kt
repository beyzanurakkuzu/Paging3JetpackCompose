package com.beyzaakkuzu.paging3demo.data.remote

import com.beyzaakkuzu.paging3demo.BuildConfig
import com.beyzaakkuzu.paging3demo.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface UnsplashApi {

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY} ")
    @GET("/photos")
    suspend fun  gellAllImages(
        @Query("page") page:Int,
        @Query("per_page") per_page:Int
    ): List<UnsplashImage>

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY} ")
    @GET("/search/photos")
    suspend fun  searchImages(
        @Query("page") page:Int,
        @Query("per_page") per_page:Int
    ): List<UnsplashImage>
}