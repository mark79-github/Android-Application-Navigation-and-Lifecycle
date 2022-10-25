package com.martinbg.androidapplicationnavigationandlifecycle.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.martinbg.androidapplicationnavigationandlifecycle.R
import com.martinbg.androidapplicationnavigationandlifecycle.databinding.ActivitySecondBinding
import com.martinbg.androidapplicationnavigationandlifecycle.fragment.FragmentADirections
import com.martinbg.androidapplicationnavigationandlifecycle.fragment.FragmentBDirections
import com.martinbg.androidapplicationnavigationandlifecycle.fragment.FragmentCDirections
import com.martinbg.androidapplicationnavigationandlifecycle.fragment.FragmentDDirections

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.titleText = intent.getStringExtra(getString(R.string.intent_argument_title))
            ?: getString(R.string.intent_argument_title_not_found)
        title = getString(R.string.second_activity_title, binding.titleText)

        binding.button.setOnClickListener {
            val navController = Navigation.findNavController(binding.navHostFragment)

            when (navController.currentDestination?.id) {
                R.id.fragmentA -> navController.navigate(FragmentADirections.actionFragmentAToFragmentB())
                R.id.fragmentB -> navController.navigate(FragmentBDirections.actionFragmentBToFragmentC())
                R.id.fragmentC -> navController.navigate(FragmentCDirections.actionFragmentCToFragmentD())
                R.id.fragmentD -> navController.navigate(FragmentDDirections.actionFragmentDToFragmentA())
            }
        }
    }
}