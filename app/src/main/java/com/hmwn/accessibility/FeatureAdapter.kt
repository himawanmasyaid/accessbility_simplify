package com.hmwn.accessibility

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hmwn.accessibility.databinding.ItemFeatureBinding

class FeatureAdapter(val features: List<String>) :
    RecyclerView.Adapter<FeatureAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemFeatureBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = features[position]
        holder.bindTo(item)
    }

    override fun getItemCount() = features.size

    inner class ViewHolder(val binding: ItemFeatureBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindTo(data: String) {

            with(binding) {

                tvTitle.text = data

            }

        }

    }

}