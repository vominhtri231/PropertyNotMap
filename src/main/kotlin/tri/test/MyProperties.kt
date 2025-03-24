package org.example.tri.test

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component


@ConfigurationProperties(prefix = "my.test")
@Component
class MyProperties {
    var customs: List<CustomA> = listOf()
    var bases: List<Base> = listOf()

    open class Base(
        var type: String = ""
    )

    class CustomA(
        var y: String = "",
        var z: String = "",
    ) : Base()
}