package dev.vehki.recipebot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RecipeBotApplication

fun main(args: Array<String>) {
    runApplication<RecipeBotApplication>(*args)
}
