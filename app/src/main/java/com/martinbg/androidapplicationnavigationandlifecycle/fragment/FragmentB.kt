package com.martinbg.androidapplicationnavigationandlifecycle.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.martinbg.androidapplicationnavigationandlifecycle.databinding.FragmentBBinding

class FragmentB : Fragment() {

    lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBBinding.inflate(inflater)

        binding.button.setOnClickListener {

            val action = FragmentBDirections.actionFragmentBToFragmentC()
            it.findNavController().navigate(action)

        }

        return binding.root
    }
}