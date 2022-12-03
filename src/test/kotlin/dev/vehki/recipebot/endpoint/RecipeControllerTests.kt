package dev.vehki.recipebot.endpoint

import dev.vehki.recipebot.controller.RecipeController
import dev.vehki.recipebot.data.Recipe
import dev.vehki.recipebot.service.RecipeService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension


@ExtendWith(MockitoExtension::class)
class RecipeControllerTests {

    @InjectMocks
    private lateinit var recipeController: RecipeController

    @Mock
    private lateinit var recipeService: RecipeService

    @Test
    fun testGetRecipePositive() {
        // given
        Mockito.`when`(recipeService.getByName("quack"))
            .thenReturn(Recipe("quack", emptySet()))

        // when
        val recipe = recipeController.getRecipe("quack")

        // then
        assertThat(recipe).isNotNull
        assertThat(recipe?.name).isEqualTo("quack")
        assertThat(recipe?.components).isEqualTo(emptySet<String>())
    }
}