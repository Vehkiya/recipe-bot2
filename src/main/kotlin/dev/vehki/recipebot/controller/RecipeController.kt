package dev.vehki.recipebot.controller

import dev.vehki.recipebot.data.Recipe
import dev.vehki.recipebot.logger
import dev.vehki.recipebot.service.RecipeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class RecipeController
@Autowired constructor(val recipeService: RecipeService) {

    private val logger = logger<RecipeController>()

    @GetMapping("/recipe")
    fun getRecipe(@RequestParam recipeRequest: String): Recipe? {
        logger.info("Processing request [$recipeRequest]")
        return recipeService.getByName(recipeRequest)
    }
}
