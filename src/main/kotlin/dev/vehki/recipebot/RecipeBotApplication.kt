package dev.vehki.recipebot

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RecipeBotApplication

fun main(args: Array<String>) {
    runApplication<RecipeBotApplication>(*args)
}

inline fun <reified T> logger(): Log {
    return LogFactory.getLog(T::class.java)
}
