package org.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties

@SpringBootApplication
@EnableConfigurationProperties
class PropertyNotMapApplication

fun main(args: Array<String>) {
    SpringApplication.run(PropertyNotMapApplication::class.java, *args)
}