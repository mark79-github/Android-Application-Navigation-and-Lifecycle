package com.martinbg.androidapplicationnavigationandlifecycle.activity

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.martinbg.androidapplicationnavigationandlifecycle.R
import com.martinbg.androidapplicationnavigationandlifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = getString(R.string.main_activity_title)
        binding.button.setOnClickListener {
            val title = binding.editText.text.trim().toString()

            when (TextUtils.isEmpty(title)) {
                true -> Toast.makeText(this, getString(R.string.msg_no_empty_title), Toast.LENGTH_SHORT).show()
                else -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    val bundle = bundleOf(getString(R.string.intent_argument_title) to title)
                    intent.putExtras(bundle)
                    startActivity(intent)
                    binding.editText.text.clear()
                }
            }
        }
    }
}