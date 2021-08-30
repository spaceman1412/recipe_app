package com.example.recipeapp


class DataContainer{

    companion object{
        val itemsList : MutableList<SmallItem> = mutableListOf(
            SmallItem("https://c.ndtvimg.com/2020-05/rdcvrtb_fried-egg_625x300_29_May_20.jpg","Egg","Thien Nguyen",
                Detail(176,50,50,"Heavy cream\n" +
                        "Salt\n" +
                        "Eggs", Reviews("Thien Nguyen","This is a comment"))
            ),SmallItem("https://food.fnr.sndimg.com/content/dam/images/food/fullset/2012/11/2/0/DV1510H_fried-chicken-recipe-10_s4x3.jpg.rend.hgtvcom.616.462.suffix/1568222255998.jpeg","Fried Chicken","Thien Nguyen",
                Detail(176,50,50,"2 whole free-range, organic chickens\n" +
                        "Vegetable oil of choice, for frying the chicken\n" +
                        "6 cups all-purpose flour\n" +
                        "5 tablespoons salt\n" +
                        "4 tablespoons ground black pepper\n",Reviews("Thien Nguyen","This is a comment"))
            ),SmallItem("https://food.fnr.sndimg.com/content/dam/images/food/fullset/2016/12/8/1/JE0205H_Cacio-Pepe-Popcorn_s4x3.jpg.rend.hgtvcom.616.462.suffix/1481216491893.jpeg","Popcorn","Thien Nguyen",
                Detail(176,50,50,"2 tablespoons extra-virgin olive oil\n" +
                        "2 tablespoons unsalted butter, at room temperature\n" +
                        "1 clove garlic, peeled and smashed\n" +
                        "2 tablespoons vegetable oil\n" +
                        "1/2 cup popcorn kernels\n",Reviews("Thien Nguyen","This is a comment"))
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