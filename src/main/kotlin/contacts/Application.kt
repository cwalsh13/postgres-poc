package contacts

import mu.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans

/**
 * Main.
 *
 * @author MicroPact, Inc.
 */
@SpringBootApplication
class Application

val beans = beans {
    bean { ContactService(ref()) }
}

class BeansInitializer : ApplicationContextInitializer<GenericApplicationContext> {
    override fun initialize(context: GenericApplicationContext) {
        beans.initialize(context)
    }
}

@Suppress("Detekt.SpreadOperator")
fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
