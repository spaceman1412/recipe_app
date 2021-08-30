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
//        https://tinhayvip.com/wp-content/uploads/2021/04/food-boy-2-1.jpg
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
            DataContainer.itemsList.add(
                SmallItem(imgUrl,titleName,"Thien Nguyen",
                    Detail(176,50,50,description, Reviews("Thien Nguyen","This is a comment"))
                ),
            )
            println(DataContainer.itemsList)
            val adapter = LargeAdapter(view)
            adapter.notifyDataSetChanged()
            Navigation.findNavController(view).navigate(R.id.action_fragmentAddScreen_to_homeScreen)

        }

        return view
    }


}