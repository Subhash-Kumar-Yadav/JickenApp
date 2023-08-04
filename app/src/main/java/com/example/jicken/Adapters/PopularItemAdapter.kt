package com.example.jicken.Adapters

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jicken.databinding.PopularItemsRvBinding

class PopularItemAdapter(private val items:List<String> , private val image: List<Int> , private val price:List<String>) : RecyclerView.Adapter<PopularItemAdapter.PopularViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
      return PopularViewHolder(PopularItemsRvBinding.inflate(LayoutInflater.from(parent.context) , parent , false))
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val items = items[position]
        val images = image[position]
        val prices = price[position]

        holder.bind(items , prices , images)

    }
    override fun getItemCount(): Int {
        return items.size
    }
    class PopularViewHolder(private val binding : PopularItemsRvBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(items: String, prices: String, images: Int) {
            binding.foodName.text = items
            binding.foodPrice.text = prices
            binding.foodImg.setImageResource(images)
        }
    }
}