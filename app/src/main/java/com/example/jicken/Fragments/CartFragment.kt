package com.example.jicken.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jicken.Adapters.CartItemsAdapter
import com.example.jicken.R
import com.example.jicken.databinding.CartItemsRvBinding
import com.example.jicken.databinding.FragmentCartBinding


class CartFragment : Fragment() {
    private lateinit var binding:FragmentCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(inflater , container , false)

        val cartFoodName = listOf("Burger" , "Apple" , "Banana" , "Papaya" , "Burger" , "Apple" , "Banana" , "Papaya")
        val cartFoodPrice = listOf("$5" ,"$10" , "$5" , "$20", "$5" ,"$10" , "$5" , "$20");
        val cartFoodImages = listOf(
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f1,
            R.drawable.f3,
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f1,
            R.drawable.f3
        )
        binding.cartItemsRv.layoutManager = LinearLayoutManager(requireContext())
        val adapter = CartItemsAdapter(cartFoodName as MutableList<String>, cartFoodPrice as MutableList<String>, cartFoodImages as MutableList<Int>)
        binding.cartItemsRv.adapter = adapter
        return binding.root
    }

    companion object {

    }
}