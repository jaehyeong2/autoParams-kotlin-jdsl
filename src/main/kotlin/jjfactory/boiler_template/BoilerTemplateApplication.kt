package jjfactory.boiler_template

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BoilerTemplateApplication

fun main(args: Array<String>) {
	runApplication<BoilerTemplateApplication>(*args)
}
