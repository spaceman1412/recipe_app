package com.example.recipeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class FragmentAddScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_screen, container, false)

        val textfield_titleName : TextInputEditText = view.findViewById(R.id.add_titleName)
        val textfield_imgUrl : TextInputEditText = view.findViewById(R.id.add_imgUrl)
        val textfield_description : TextInputEditText = view.findViewById(R.id.add_description)

        val back_btn : Button = view.findViewById(R.id.back_btn)
        back_btn.setOnClickListener {
            val titleName = textfield_titleName.text.toString()
            val imgUrl = textfield_imgUrl.text.toString()
            val description = textfield_description.text.toString()
            println("Title name: "+titleName + " Image Url" + imgUrl + " Description:" + description)

            Navigation.findNavController(view).navigate(R.id.action_fragmentAddScreen_to_homeScreen)

        }

        return view
    }


}