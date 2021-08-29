package com.example.recipeapp

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class LargeAdapter() : RecyclerView.Adapter<LargeAdapter.ViewHolder>(){

    data class item(val imgUrl : String, val titleName: String, val authorName: String)

    val itemsList : List<item> = listOf<item>(item("https://c.ndtvimg.com/2020-05/rdcvrtb_fried-egg_625x300_29_May_20.jpg","Egg","Thien Nguyen"),
        item("https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/727bda84826873.5d6906eb29c0a.jpg","Fish","Thien Nguyen"),
        item("https://www.eatthis.com/wp-content/uploads/sites/4//media/images/ext/290953630/potato-chips.jpg?quality=82&strip=1&resize=640%2C360","Snack","Thien Nguyen")
        )

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
        holder.textView_titleName.text = itemsList.get(position).titleName
        holder.textView_authorName.text = "by "+itemsList.get(position).authorName
        Picasso.get().load(itemsList.get(position).imgUrl).into(holder.imageView_largeItem)

    }

    override fun getItemCount(): Int {
        return 3
    }


}