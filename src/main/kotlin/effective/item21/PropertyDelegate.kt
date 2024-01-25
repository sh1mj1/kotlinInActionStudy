package effective.item21

import kotlin.reflect.KProperty

class PropertyDelegate {
    /*
    var token: String? = null
        get() {
            println("token returned value $field")
            return field
        }
        set(value) {
            println("token changed from $field to $value")
            field = value
        }
    var attempt: Int = 0
        get() {
            println("attempt returned value $field")
            return field
        }
        set(value) {
            println("attempt changed from $field to $value")
            field = value
        }
        */

    var token: String? by LoggingProperty(null)
    var attempt: Int by LoggingProperty(0)
}

class LoggingProperty<T>(var value: T) {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): T {
        println("${prop.name} returned value $value")
        return value
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, newValue: T) {
        val name = prop.name
        println("$name changed from $value to $newValue")
        value = newValue
    }
}