package com.recipe.search.data.network.api_response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RecipeDetailsResponseModel(
    @Expose
    @SerializedName("recipe")
    var recipe: Recipe? = Recipe()
)


data class Recipe(

    @Expose
    @SerializedName("publisher")
    var publisher: String? = null,

    @Expose
    @SerializedName("ingredients")
    var ingredients: ArrayList<String> = arrayListOf(),

    @Expose
    @SerializedName("source_url")
    var sourceUrl: String? = null,

    @Expose
    @SerializedName("recipe_id")
    var recipeId: String? = null,

    @Expose
    @SerializedName("image_url")
    var imageUrl: String? = null,

    @Expose
    @SerializedName("social_rank")
    var socialRank: Any? = null,

    @Expose
    @SerializedName("publisher_url")
    var publisherUrl: String? = null,

    @Expose
    @SerializedName("title")
    var title: String? = null


)
