package com.tekinarslan.app.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.navGraphViewModels
import com.tekinarslan.app.R
import com.tekinarslan.app.common.LoaderStateAdapter
import com.tekinarslan.app.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : Fragment() {

    //When you use navGraphViewModels, your viewmodel state saved into navgraph lifecycle
    val viewModel: HomeViewModel by navGraphViewModels(R.id.mobile_navigation) {
        defaultViewModelProviderFactory
    }

    //This is view binding
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val homeRVAdapter = HomeRVAdapter()
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapters()
        listenData()
    }
    private fun initAdapters() {
        recyclerView.adapter = homeRVAdapter
        binding.recyclerView.adapter = homeRVAdapter.withLoadStateFooter(LoaderStateAdapter())
    }

    private fun listenData() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.pagingData.collectLatest { pagingData ->
                homeRVAdapter.submitData(lifecycle, pagingData)
            }
        }
    }

}