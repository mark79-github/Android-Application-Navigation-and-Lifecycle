package com.martinbg.androidapplicationnavigationandlifecycle.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.martinbg.androidapplicationnavigationandlifecycle.databinding.FragmentDBinding

class FragmentD : Fragment() {

    lateinit var binding: FragmentDBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDBinding.inflate(inflater)

        binding.button.setOnClickListener {

            val action = FragmentDDirections.actionFragmentDToFragmentA()
            it.findNavController().navigate(action)

        }

        return binding.root
    }
}