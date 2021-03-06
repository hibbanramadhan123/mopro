package com.example.myapplication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.myapplication.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentMainBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_main,container,false)
        binding.button2.setOnClickListener {
            v:View->
            v.findNavController().navigate(R.id.action_mainFragment_to_persegiFragment)
        }
        binding.button3.setOnClickListener {
            v:View->
            v.findNavController().navigate(R.id.action_mainFragment_to_segitigaFragment)
        }
        return binding.root
    }


}
