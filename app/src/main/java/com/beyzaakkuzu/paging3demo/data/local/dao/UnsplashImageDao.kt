package com.beyzaakkuzu.paging3demo.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.beyzaakkuzu.paging3demo.model.UnsplashImage


@Dao
interface UnsplashImageDao {
    @Query("SELECT * FROM unsplash_image_table")
    fun getAllImages():PagingSource<Int,UnsplashImage>

    @Insert(onConflict = REPLACE)
    suspend fun addImages(images:List<UnsplashImage>)

    @Query("DELETE FROM unsplash_image_table")
    suspend fun deleteAllImages()
}