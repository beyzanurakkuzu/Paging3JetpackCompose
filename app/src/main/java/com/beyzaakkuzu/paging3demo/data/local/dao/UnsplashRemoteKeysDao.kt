package com.beyzaakkuzu.paging3demo.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.beyzaakkuzu.paging3demo.model.UnsplashRemoteKeys

@Dao
interface UnsplashRemoteKeysDao {
    @Query("SELECT * FROM unsplash_reemote_keys_table WHERE id=:id")
    suspend fun getRemoteKeys(id:String): UnsplashRemoteKeys

    @Insert(onConflict = REPLACE)
    suspend fun addAllRemoteKeys(remoteKeys: List<UnsplashRemoteKeys>)

    @Query("DELETE FROM unsplash_reemote_keys_table ")
    suspend fun deleteAllRemoteKeys()

}