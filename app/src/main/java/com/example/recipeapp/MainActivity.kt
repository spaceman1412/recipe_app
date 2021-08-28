package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView_small : RecyclerView = findViewById(R.id.recyclerView_smallList)

        recyclerView_small.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)


        recyclerView_small.adapter = SmallAdapter()

        val recyclerView_large : RecyclerView = findViewById(R.id.recyclerView_largeList)
        recyclerView_large.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        recyclerView_large.adapter = LargeAdapter()

    }
}