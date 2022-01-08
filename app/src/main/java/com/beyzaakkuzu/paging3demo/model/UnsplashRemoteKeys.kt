package com.beyzaakkuzu.paging3demo.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.beyzaakkuzu.paging3demo.util.Constants.UNSPLASH_REMOTE_KEYS_TABLE

@Entity(tableName = UNSPLASH_REMOTE_KEYS_TABLE)
data class UnsplashRemoteKeys(
    @PrimaryKey(autoGenerate = true)
    val id:String,
    val prevPage:Int?,
    val nextPage:Int?
)
