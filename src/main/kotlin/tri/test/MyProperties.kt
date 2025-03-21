package org.example.tri.test

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component


@ConfigurationProperties(prefix = "my.test")
@Component
class MyProperties {
    var base: Base = Base()
    var customAList: List<CustomA> = listOf()
    var customBList: List<CustomB> = listOf()

    open class Base(
        var type: String = ""
    )

    class CustomA(
        var y: String = "",
        var z: String = "",
    ) : Base()

    class CustomB(
        var x: String = "",
    ) : Base()
}