package com.tekinarslan.app.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.tekinarslan.app.R
import com.tekinarslan.app.data.model.Book
import com.tekinarslan.app.databinding.ItemRvaBinding

class HomeRVAdapter : PagingDataAdapter<Book, HomeRVAdapter.HomeViewHolder>(TeacherComparator) {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.context),
                R.layout.item_rva,
                viewGroup,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val uiModel = getItem(position)
        uiModel.let {
            holder.bind(uiModel!!)
        }
    }

    inner class HomeViewHolder(private val binding: ItemRvaBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Book) {
            binding.item = item
        }
    }
}

object TeacherComparator : DiffUtil.ItemCallback<Book>() {
    override fun areItemsTheSame(oldItem: Book, newItem: Book): Boolean {
        return oldItem.last_update == newItem.last_update
    }

    override fun areContentsTheSame(oldItem: Book, newItem: Book): Boolean {
        return oldItem == newItem
    }
}