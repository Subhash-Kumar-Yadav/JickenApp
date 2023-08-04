package com.example.jicken.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.jicken.Adapters.PopularItemAdapter
import com.example.jicken.MenuBottomSheetFragment
import com.example.jicken.R
import com.example.jicken.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater , container , false)
        binding.viewMenu.setOnClickListener {
            val bottomSheetDialog = MenuBottomSheetFragment()
            bottomSheetDialog.show(parentFragmentManager , "Test")
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.banner1 , ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.ban1 , ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner1 , ScaleTypes.FIT))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList , ScaleTypes.FIT)

        imageSlider.setItemClickListener(object : ItemClickListener{
            override fun doubleClick(position: Int) {

            }

            override fun onItemSelected(position: Int) {
                val itemPosition = imageList[position]
                val message = "You clicked position $itemPosition"
                Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
            }

        })

        val foodName = listOf("Pizza" , "Burger" , "Pasta" , "Apple", "Pizza" , "Burger" , "Pasta" , "Apple")
        val foodPrices = listOf("$5" , "$10" , "$8" , "$20", "$5" , "$10" , "$8" , "$20")
        val foodImages = listOf(R.drawable.f1 , R.drawable.f2 , R.drawable.f3 , R.drawable.f1 ,
            R.drawable.f1 , R.drawable.f2 , R.drawable.f3 , R.drawable.f1)

        val adapter = PopularItemAdapter(foodName , foodImages , foodPrices)
        binding.popularItemRv.layoutManager = LinearLayoutManager(requireContext())
        binding.popularItemRv.adapter = adapter
    }

    companion object {

    }
}