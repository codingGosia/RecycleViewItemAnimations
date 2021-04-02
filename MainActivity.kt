package com.gosia.recyclerviewitemanimations

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.gosia.recyclerviewitemanimations.databinding.ActivityMainBinding

class MainActivity  : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = MyAdapter()
        adapter.submitList(listOf(
            Color.YELLOW,
            Color.CYAN,
            Color.GREEN,
            Color.MAGENTA,
            Color.TRANSPARENT,
            Color.LTGRAY,
            Color.DKGRAY

        ))
        binding.rvColors.apply {
            this.adapter = adapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}


