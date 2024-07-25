package com.raphix.picsum

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.raphix.picsum.ui.DataAdapter
import com.raphix.picsum.ui.viewmodels.PicturesViewModel

class MainActivity : AppCompatActivity() {

    private val dataViewModel: PicturesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        dataViewModel.getData().observe(this) { dataList ->
            val adapter = DataAdapter(dataList)
            recyclerView.adapter = adapter
        }
    }
}