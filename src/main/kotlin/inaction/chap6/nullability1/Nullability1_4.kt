package inaction.chap6.nullability1

import inaction.chap6.nullability1.safeCast4.Person

fun strLen(s: String) = s.length

fun strLenSafe(s: String?): Int =
    if (s != null) s.length else 0

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person(val name: String, val company: Company?)

fun Person.countryName(): String = this.company?.address?.country ?: "Unknown"

// 엘비스 연산자
fun foo(s: String?): String = s ?: ""

fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No address") // 주소가 없으면 예외 던짐
    with(address) { // 여기서는 address 가 not-null
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}
