package inaction.chap7.delegatedProperty5.delegatedPropertyImpl3

import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun testPerson1PropertyChangeListener() {
        val p = Person1("Dmitry", 34, 2000)
        p.addPropertyChangeListener { event ->
            println(
                "Property ${event.propertyName} changed" +
                        "from ${event.oldValue} to ${event.newValue}"
            )
        }
        p.age = 35 // print /* Property age changed from 34 to 35 */
        p.salary = 2100 // print /* Property salary changed from 2000 to 2100
    }

    @Test
    fun testPerson2PropertyChangeListener() {
        val p = Person2("Dmitry", 34, 2000)
        p.addPropertyChangeListener { event ->
            println(
                "Property ${event.propertyName} changed" +
                        "from ${event.oldValue} to ${event.newValue}"
            )
        }
        p.age = 35 // print /* Property age changed from 34 to 35 */
        p.salary = 2100 // print /* Property salary changed from 2000 to 2100
    }

    @Test
    fun testPerson3PropertyChangeListener() {
        val p = Person3("Dmitry", 34, 2000)
        p.addPropertyChangeListener { event ->
            println(
                "Property ${event.propertyName} changed" +
                        "from ${event.oldValue} to ${event.newValue}"
            )
        }
        p.age = 35 // print /* Property age changed from 34 to 35 */
        p.salary = 2100 // print /* Property salary changed from 2000 to 2100
    }

    @Test
    fun testPerson4PropertyChangeListener() {
        val p = Person4("Dmitry", 34, 2000)
        p.addPropertyChangeListener { event ->
            println(
                "Property ${event.propertyName} changed" +
                        "from ${event.oldValue} to ${event.newValue}"
            )
        }
        p.age = 35 // print /* Property age changed from 34 to 35 */
        p.salary = 2100 // print /* Property salary changed from 2000 to 2100
    }
}