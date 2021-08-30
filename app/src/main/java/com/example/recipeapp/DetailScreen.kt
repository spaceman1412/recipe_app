package com.example.recipeapp

import android.os.Bundle
import android.os.TestLooperManager
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.squareup.picasso.Picasso


class DetailScreen : Fragment() {

    val args : DetailScreenArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_detail_screen, container, false)



        val id = args.number
        val itemsList : List<SmallItem> = DataContainer.itemsList
        val imgBanner : ImageView = view.findViewById(R.id.imageView_banner)

        //set data
        Picasso.get().load(itemsList.get(id).imgUrl).into(imgBanner)
        view.findViewById<TextView>(R.id.textView_titleNamedetail).setText(itemsList.get(id).itemName)
        view.findViewById<TextView>(R.id.textview_description).setText(itemsList.get(id).detail.description)



        return view
    }
}