package effective.item24.covariance

open class Dog
class Puppy : Dog()
class Hound : Dog()


fun takeDog(dog: Dog) {
    // body code
}

// 다형성, IMPLICIT UPCASTING 덕분에 가능하다.
fun implicitUpcasting() {
    takeDog(Dog())
    takeDog(Puppy())
    takeDog(Hound())
}