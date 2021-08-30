package com.example.recipeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeScreen : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_home_screen, container, false)

        val recyclerView_small : RecyclerView =  view.findViewById(R.id.recyclerView_smallList)

        recyclerView_small.layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)

        recyclerView_small.adapter = SmallAdapter(view)

        val recyclerView_large : RecyclerView = view.findViewById(R.id.recyclerView_largeList)
        recyclerView_large.layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        recyclerView_large.adapter = LargeAdapter(view)

        return view
    }


}