package com.tekinarslan.app.domain.usecase

import com.tekinarslan.app.domain.repository.ApiService
import com.tekinarslan.app.data.model.ResponseModel
import javax.inject.Inject

class EntriesUseCase @Inject constructor(
    var service: ApiService
) {

    suspend fun entries(
        offset: Int,
        pageLimit: Int
    ): ResponseModel {
        return service.entries(
            "book",
            offset,
            pageLimit
        )
    }
}