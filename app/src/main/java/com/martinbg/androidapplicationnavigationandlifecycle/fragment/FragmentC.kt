package com.martinbg.androidapplicationnavigationandlifecycle.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.martinbg.androidapplicationnavigationandlifecycle.databinding.FragmentCBinding

class FragmentC : Fragment() {
    lateinit var binding: FragmentCBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCBinding.inflate(inflater)

        binding.button.setOnClickListener {

            val action = FragmentCDirections.actionFragmentCToFragmentD()
            it.findNavController().navigate(action)

        }

        return binding.root
    }
}