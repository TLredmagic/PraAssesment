package com.example.android.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android.navigation.databinding.FragmentPersegiBinding
import kotlinx.android.synthetic.main.fragment_persegi.*

/**
 * A simple [Fragment] subclass.
 */
class PersegiFragment : Fragment() {

    private lateinit var B:FragmentPersegiBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val binding = DataBindingUtil.inflate<FragmentPersegiBinding>(
                inflater, R.layout.fragment_persegi, container, false)


        binding.btnCalc.setOnClickListener {
            val width = Integer.parseInt(binding.etWidth.text.toString())
            val length = Integer.parseInt(binding.etLength.text.toString())
            textView2.text = "Luas : " + (width*length)
            textView3.text = "Keliling : " + (width+width+length+length)
        }


        return binding.root

    }


}
