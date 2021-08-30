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

class LargeAdapter(val view_context: View) : RecyclerView.Adapter<LargeAdapter.ViewHolder>(){

    val itemsList : List<SmallItem> = DataContainer.itemsList

            class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
                val imageView_largeItem : ImageView
                val textView_titleName : TextView
                val textView_authorName : TextView

                init {
                    imageView_largeItem = view.findViewById(R.id.imageView_largeItem)
                    textView_titleName = view.findViewById(R.id.textView_titleName)
            textView_authorName = view.findViewById(R.id.textView_authorName)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.large_item,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView_titleName.text = itemsList.get(position).itemName
        holder.textView_authorName.text = "by "+itemsList.get(position).authorName
        Picasso.get().load(itemsList.get(position).imgUrl).into(holder.imageView_largeItem)
        holder.imageView_largeItem.setOnClickListener {
            val action = HomeScreenDirections.actionHomeScreenToDetailScreen(position)

            Navigation.findNavController(view_context).navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return itemsList.count()
    }


}