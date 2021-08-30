package com.example.recipeapp


class DataContainer{

    companion object{
        val itemsList : List<SmallItem> = listOf(
            SmallItem("https://c.ndtvimg.com/2020-05/rdcvrtb_fried-egg_625x300_29_May_20.jpg","Egg","Thien Nguyen",
                Detail(176,50,50,"This is description", Reviews("Thien Nguyen","This is a comment"))
            ),SmallItem("https://c.ndtvimg.com/2020-05/rdcvrtb_fried-egg_625x300_29_May_20.jpg","Egg","Thien Nguyen",
                Detail(176,50,50,"This is description",Reviews("Thien Nguyen","This is a comment"))
            ),SmallItem("https://c.ndtvimg.com/2020-05/rdcvrtb_fried-egg_625x300_29_May_20.jpg","Egg","Thien Nguyen",
                Detail(176,50,50,"This is description",Reviews("Thien Nguyen","This is a comment"))
            )
        )

        var test : String = "Hello"

        fun setData(){
            test = "Alo"
        }
    }

}
data class SmallItem(val imgUrl: String, val itemName: String,val authorName: String ,val detail: Detail)
data class Detail(val calories: Int, val ingredients: Int, val totalTime: Int, val description: String, val reviews: Reviews )
data class Reviews(val username: String, val comment: String)