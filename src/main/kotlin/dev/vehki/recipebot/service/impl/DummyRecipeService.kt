package dev.vehki.recipebot.service.impl

import dev.vehki.recipebot.data.Recipe
import dev.vehki.recipebot.service.RecipeService
import org.springframework.stereotype.Service

@Service
class DummyRecipeService : RecipeService {
    override fun getByName(name: String): Recipe {
        return Recipe(name, emptySet())
    }
}