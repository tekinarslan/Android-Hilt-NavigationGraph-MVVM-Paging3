package com.tekinarslan.app.domain.repository

import com.tekinarslan.app.data.model.ResponseModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/search/lists.json")
    suspend fun entries(
        @Query("q") queryName: String,
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): ResponseModel

}