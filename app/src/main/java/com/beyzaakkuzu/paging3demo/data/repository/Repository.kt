package com.beyzaakkuzu.paging3demo.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.beyzaakkuzu.paging3demo.data.local.UnsplashDatabase
import com.beyzaakkuzu.paging3demo.data.paging.UnsplashRemoteMediator
import com.beyzaakkuzu.paging3demo.data.remote.UnsplashApi
import com.beyzaakkuzu.paging3demo.model.UnsplashImage
import com.beyzaakkuzu.paging3demo.util.Constants.ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ExperimentalPagingApi
class Repository @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
){

    fun getAllImages(): Flow<PagingData<UnsplashImage>> {
        val pagingSourceFactory = { unsplashDatabase.unSplashImageDao().getAllImages()}
        return Pager(
            config = PagingConfig(pageSize =ITEMS_PER_PAGE ),
            remoteMediator = UnsplashRemoteMediator(
                unsplashApi= unsplashApi,
                unsplashDatabase= unsplashDatabase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }
}