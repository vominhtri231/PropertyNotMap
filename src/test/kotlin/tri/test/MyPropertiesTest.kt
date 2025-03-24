package tri.test


import org.example.PropertyNotMapApplication
import org.example.tri.test.MyProperties
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource

@SpringBootTest(classes = [PropertyNotMapApplication::class])
@TestPropertySource(
    properties = [
        "my.test.customs[0].type=value3",
        "my.test.customs[0].y=value1",
        "my.test.customs[0].z=value2"
    ]
)
class MyPropertiesTest {

    @Autowired
    lateinit var myProperties: MyProperties

    @Test
    fun testPropertiesBindingIssue() {
        assertNotNull(myProperties.customs)
        assertEquals(1, myProperties.customs.size, "Expected one custom property to be loaded")

        val customA = myProperties.customs[0]
        assertEquals("value1", customA.y)
        assertEquals("value2", customA.z)

        // fail here, actually bind to empty string
        assertEquals("value3", customA.type)
    }
}
