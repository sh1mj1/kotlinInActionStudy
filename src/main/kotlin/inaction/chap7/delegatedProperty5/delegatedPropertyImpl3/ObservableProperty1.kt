package inaction.chap7.delegatedProperty5.delegatedPropertyImpl3

import java.beans.PropertyChangeSupport

class ObservableProperty1(
    val propName: String, var propValue: Int, val changeSupport: PropertyChangeSupport
) {
    fun getValue(): Int = propValue
    fun setValue(newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(propName, oldValue, newValue)
    }
}

class Person2(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    val _age = ObservableProperty1("age", age, changeSupport)
    var age: Int
        get() = _age.getValue()
        set(value) { _age.setValue(value) }
    val _salary = ObservableProperty1("salary", salary, changeSupport)
    var salary: Int
        get() = _salary.getValue()
        set(value) { _salary.setValue(value) }
}