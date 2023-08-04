package com.example.jicken.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jicken.databinding.CartItemsRvBinding

class CartItemsAdapter(private val cartItems:MutableList<String> , private val cartItemPrice:MutableList<String> ,
 private val cartItemImg:MutableList<Int>) : RecyclerView.Adapter<CartItemsAdapter.CartViewHolder>() {

     var itemQuantities = IntArray(cartItems.size){1}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        return CartViewHolder(CartItemsRvBinding.inflate(LayoutInflater.from(parent.context) , parent , false))

    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val name = cartItems[position]
        val price = cartItemPrice[position]
        val image = cartItemImg[position]
        val itemQuantity = itemQuantities[position]
        holder.bind(name , price , image , itemQuantity)
    }

    override fun getItemCount(): Int {
        return cartItems.size
    }
    class CartViewHolder(private val binding:CartItemsRvBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(name: String, price: String, image: Int, itemQuantities: Int) {
            binding.apply {
                cartItemFoodName.text = name
                cartItemPrice.text = price
                cartItemImg.setImageResource(image)
                itemQuantity.text = itemQuantities.toString()

                minusBtn.setOnClickListener {

                }
                plusBtn.setOnClickListener {

                }
                deleteCart.setOnClickListener {

                }
            }
        }
    }

}