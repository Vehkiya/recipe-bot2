package dev.vehki.recipebot

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.junit.jupiter.SpringExtension

@SpringBootTest
@ExtendWith(SpringExtension::class)
class RecipeBotApplicationTests
@Autowired
constructor(val applicationContext: ApplicationContext) {

    @Test
    fun contextLoads() {
        assertNotNull(applicationContext)
    }

}
