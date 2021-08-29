package com.example.recipeapp

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class SmallAdapter(val view_context: View) : RecyclerView.Adapter<SmallAdapter.ViewHolder>() {
    data class SmallItem(val imgUrl: String, val itemName: String)

    val listItems: List<SmallItem> = listOf<SmallItem>(
        SmallItem("https://static.toiimg.com/thumb/54478818.cms?width=1200&height=900", "Hotdog"),
        SmallItem(
            "http://assets.epicurious.com/photos/57c5c6d9cf9e9ad43de2d96e/master/pass/the-ultimate-hamburger.jpg",
            "Hamburger"
        ),
        SmallItem(
            "https://www.acouplecooks.com/wp-content/uploads/2019/05/Chopped-Salad-001_1.jpg",
            "Salad"
        )
    )

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView_itemName: TextView
        val imageView_smallItem: ImageView

        init {
            textView_itemName = view.findViewById(R.id.textView_itemName)
            imageView_smallItem = view.findViewById(R.id.imageView_smallItem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.small_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView_itemName.text = listItems.get(position).itemName
        Picasso.get().load(listItems.get(position).imgUrl).into(holder.imageView_smallItem)
        holder.imageView_smallItem.setOnClickListener {
            Navigation.findNavController(view_context).navigate(R.id.action_homeScreen_to_detailScreen)
        }
    }



    override fun getItemCount(): Int {
        return listItems.size
    }

}