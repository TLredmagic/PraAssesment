package com.example.android.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android.navigation.databinding.FragmentSegitigaBinding
import kotlinx.android.synthetic.main.fragment_segitiga.*

/**
 * A simple [Fragment] subclass.
 */
class SegitigaFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSegitigaBinding>(
                inflater, R.layout.fragment_segitiga, container, false)


        binding.btnCalc.setOnClickListener {
            val width = Integer.parseInt(binding.etWidth.text.toString())
            val length = Integer.parseInt(binding.etLength.text.toString())
            textView2.text = "Luas : " + (width*length/2)
            textView3.text = "Keliling : Rumus keliling"
        }


        return binding.root

    }


}
