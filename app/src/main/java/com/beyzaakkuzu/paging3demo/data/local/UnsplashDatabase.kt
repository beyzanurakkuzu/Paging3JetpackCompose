package com.beyzaakkuzu.paging3demo.data.local

import androidx.room.Database

import androidx.room.RoomDatabase
import com.beyzaakkuzu.paging3demo.data.local.dao.UnsplashImageDao
import com.beyzaakkuzu.paging3demo.data.local.dao.UnsplashRemoteKeysDao
import com.beyzaakkuzu.paging3demo.model.UnsplashImage
import com.beyzaakkuzu.paging3demo.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase(){

    abstract fun unSplashImageDao():UnsplashImageDao
    abstract fun unSplashRemoteKeysDao():UnsplashRemoteKeysDao
}