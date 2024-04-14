package com.jhj0517.android_template_mvvm_xml.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.jhj0517.android_template_mvvm_xml.adapters.DataAdapter
import com.jhj0517.android_template_mvvm_xml.adapters.BaseRecyclerClickListener
import com.jhj0517.android_template_mvvm_xml.databinding.FragmentFirstBinding
import com.jhj0517.android_template_mvvm_xml.models.ExampleData
import com.jhj0517.android_template_mvvm_xml.viewmodels.DataViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FirstFragment : Fragment(),
    BaseRecyclerClickListener<ExampleData> {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    private val viewModel : DataViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.apply {
        }
        return binding.root
    }

    private fun subscribeUI(adapter: DataAdapter){
        viewModel.getLocalData()
        viewModel.exampleDataList.observe(viewLifecycleOwner){
            adapter.submitList(it)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemClick(item: ExampleData) {
        TODO("Not yet implemented")
    }
}