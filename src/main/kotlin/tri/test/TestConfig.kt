package org.example.tri.test

import jakarta.annotation.PostConstruct
import org.springframework.context.annotation.Configuration

@Configuration
class TestConfig(private val props: MyProperties) {

    @PostConstruct
    fun init() {
        print(props)
    }
}