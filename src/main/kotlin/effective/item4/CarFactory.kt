package effective.item4

interface CarFactory {
    fun produce() = DEFAULT_CAR
}

open class Car()
class Flat126P : Car()
// 다른 Car 확장하는 코드들

// 클라이언트 코드
val DEFAULT_CAR: Car = Flat126P()
//val DEFAULT_CAR = Flat126P()

val someCarFactory = object : CarFactory {
    override fun produce(): Car {
        TODO("Not yet implemented")
    }
}