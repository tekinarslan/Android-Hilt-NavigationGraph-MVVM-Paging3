package com.tekinarslan.app.ui.home

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.tekinarslan.app.data.datasource.DataPagingSource
import com.tekinarslan.app.data.model.Book
import com.tekinarslan.app.domain.usecase.EntriesUseCase
import kotlinx.coroutines.flow.Flow

class HomeViewModel @ViewModelInject constructor(
    private val useCase: EntriesUseCase
) : ViewModel() {

    var pagingData: Flow<PagingData<Book>>

    init {
        pagingData = fetch()
    }

    private fun fetch() = Pager(PagingConfig(pageSize = 20)) {
        DataPagingSource(useCase, true)
    }.flow.cachedIn(viewModelScope)
}