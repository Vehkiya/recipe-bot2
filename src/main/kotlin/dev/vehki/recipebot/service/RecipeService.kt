package dev.vehki.recipebot.service

import dev.vehki.recipebot.data.Recipe

interface RecipeService {

    fun getByName(name: String): Recipe
}