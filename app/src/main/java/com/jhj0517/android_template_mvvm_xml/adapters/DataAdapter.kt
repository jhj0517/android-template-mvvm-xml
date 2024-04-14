package com.jhj0517.android_template_mvvm_xml.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jhj0517.android_template_mvvm_xml.databinding.ItemExampleBinding
import com.jhj0517.android_template_mvvm_xml.models.ExampleData

class DataAdapter (private val clickListener: BaseRecyclerClickListener<ExampleData>)
    : ListAdapter<ExampleData, DataAdapter.ViewHolder>(diffUtil) {

    inner class ViewHolder(val binding: ItemExampleBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(items: ExampleData){
            with(binding){
                name.text = items.name
            }
        }

        init {
            with(binding){
                root.setOnClickListener {
                    val item = currentList[adapterPosition]
                    clickListener.onItemClick(item)
                }
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ViewHolder {
        val binding = ItemExampleBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<ExampleData>() {
            override fun areContentsTheSame(oldItem: ExampleData, newItem: ExampleData) =
                oldItem.name == newItem.name

            override fun areItemsTheSame(oldItem: ExampleData, newItem: ExampleData) =
                oldItem.name == newItem.name
        }
    }
}