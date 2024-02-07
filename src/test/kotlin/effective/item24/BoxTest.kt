package effective.item24

import effective.item24.contravariance.Amphibious
import effective.item24.contravariance.Car
import effective.item24.covariance.Dog
import effective.item24.covariance.Puppy
import org.junit.jupiter.api.Test
import effective.item24.contravariance.Box as BoxIn
import effective.item24.covariance.Box as BoxOut

class BoxTest {
    @Test
    fun puppyBoxToDogBox() {
        val puppyNotSafeBox = BoxOut<Puppy>()
        val dogBox: BoxOut<Dog> = puppyNotSafeBox
//        dogBox.set(Hound())
    }

    @Test
    fun dogHouseToAnyHouse() {
        val dogHouse = BoxOut<Dog>()
        val box: BoxOut<Any> = dogHouse
//        box.set("Some string") // box 는 실제로는 Dog 을 위한 공간이다.
//        box.set(42) // box 는 실제로는 Dog 를 위한 공간이다.
    }

    @Test
    fun testGarage() {
        val garage: BoxIn<Car> = BoxIn(
            Car()
        )
        val amphibiousSpot: BoxIn<Amphibious> = garage
//        val boat: Boat = garage.value // 하지만 boat 는 실제로는 Car 를 위한 공간임
    }

    @Test
    fun testSpot() {
        val noSpot: BoxIn<Nothing> = BoxIn<Car>(Car())
//        val boat: Nothing = noSpot.value
        // boat 에서 아무것도 만들 수 없다.
    }
}