package com.tekinarslan.app.data.datasource

import androidx.paging.PagingSource
import com.tekinarslan.app.data.model.Book
import com.tekinarslan.app.domain.usecase.EntriesUseCase
import retrofit2.HttpException
import java.io.IOException

class DataPagingSource(private val useCase: EntriesUseCase, private val hasPaging: Boolean = true) :
    PagingSource<Int, Book>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Book> {
        return try {
            val position = params.key ?: 0
            val response = useCase.entries(position, params.loadSize)
            val list = response.docs
            LoadResult.Page(
                data = list,
                prevKey = null,
                nextKey = when {
                    list.isEmpty() -> {
                        null
                    }
                    hasPaging -> {
                        position.plus(1)
                    }
                    else -> {
                        null
                    }
                }
            )
        } catch (exception: IOException) {
            return LoadResult.Error(exception)
        } catch (exception: HttpException) {
            return LoadResult.Error(exception)
        }
    }
}