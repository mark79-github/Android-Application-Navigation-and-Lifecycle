package com.martinbg.androidapplicationnavigationandlifecycle.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import com.martinbg.androidapplicationnavigationandlifecycle.databinding.FragmentABinding

class FragmentA : Fragment() {

    lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentABinding.inflate(inflater)

        binding.button.setOnClickListener {

            val action = FragmentADirections.actionFragmentAToFragmentB()
            it.findNavController().navigate(action)

        }

        return binding.root
    }


}