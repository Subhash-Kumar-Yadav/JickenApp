package com.example.jicken.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jicken.databinding.FragmentMenuBottomSheetBinding
import com.example.jicken.databinding.MenuItemsBinding

class MenuItemAdapter(private val menuItemsName:MutableList<String> , private val menuPrice:MutableList<String> , private val menuImage:MutableList<Int>) : RecyclerView.Adapter<MenuItemAdapter.MenuViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val binding = MenuItemsBinding.inflate(LayoutInflater.from(parent.context) , parent , false)
        return MenuViewHolder(binding)
    }



    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val menuItems = menuItemsName[position]
        val menuItemsPrice = menuPrice[position]
        val menuItemImg = menuImage[position]
        holder.bind(menuItems , menuItemsPrice , menuItemImg)
    }
    override fun getItemCount(): Int {
        return menuItemsName.size
    }
    class MenuViewHolder(private val binding: MenuItemsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(menuItems: String, menuItemsPrice: String, menuItemImg: Int) {

            binding.apply {
                menuFoodName.text = menuItems
                menuFoodPrice.text = menuItemsPrice
                menuFoodImg.setImageResource(menuItemImg)
            }
        }

    }
}