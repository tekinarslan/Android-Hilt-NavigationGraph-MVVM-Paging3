package com.tekinarslan.app.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import com.tekinarslan.app.R

class LoaderStateAdapter : LoadStateAdapter<LoaderStateAdapter.LoaderViewHolder>() {

    override fun onBindViewHolder(holder: LoaderViewHolder, loadState: LoadState) {
        holder.bind(loadState)
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): LoaderViewHolder {
        return LoaderViewHolder.getInstance(parent)
    }

    class LoaderViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val loading: ProgressBar = view.findViewById(R.id.progressBar)

        companion object {
            fun getInstance(parent: ViewGroup): LoaderViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                val view = inflater.inflate(R.layout.item_load_more, parent, false)
                return LoaderViewHolder(view)
            }
        }

        fun bind(loadState: LoadState) {
            if (loadState is LoadState.Loading) {
                loading.visibility = View.VISIBLE
            } else {
                loading.visibility = View.GONE
            }
        }
    }
}