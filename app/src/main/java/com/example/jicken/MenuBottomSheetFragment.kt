package com.example.jicken

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jicken.Adapters.CartItemsAdapter
import com.example.jicken.Adapters.MenuItemAdapter
import com.example.jicken.Adapters.PopularItemAdapter
import com.example.jicken.databinding.FragmentMenuBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MenuBottomSheetFragment : BottomSheetDialogFragment(){
    private lateinit var binding:FragmentMenuBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMenuBottomSheetBinding.inflate(inflater , container , false)
        val menuFoodName = listOf("Burger" , "Apple" , "Banana" , "Papaya" , "Burger" , "Apple" , "Banana" , "Papaya", "Burger" , "Apple" , "Banana" , "Papaya")
        val menuFoodPrice = listOf("$5" ,"$10" , "$5" , "$20", "$5" ,"$10" , "$5" , "$20" ,  "$5" ,"$10" , "$5" , "$20");
        val menuFoodImages = listOf(
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f1,
            R.drawable.f3,
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f1,
            R.drawable.f3,
            R.drawable.f1,
            R.drawable.f3,
            R.drawable.f1,
            R.drawable.f2
        )
        val adapter = MenuItemAdapter(menuFoodName as MutableList<String>,
            menuFoodPrice as MutableList<String>, menuFoodImages as MutableList<Int>)
        binding.menuItemsRv.layoutManager = LinearLayoutManager(requireContext())
        binding.menuItemsRv.adapter = adapter
        return binding.root
    }

    companion object {

    }
}