package effective.item24.useSiteVariance

import org.junit.jupiter.api.Test

class UseSiteVarianceKtTest {
    @Test
    fun testFillWithPuppies() {
        val dogs = mutableListOf<Dog>(Hound("Pluto"))
        fillWithPuppies(dogs)
        println(dogs) /* print [Hound(name=Pluto), Puppy(name=Jim), Puppy(name=Beam)] */

        val animals = mutableListOf<Cutie>(Cat("Felix"))
        fillWithPuppies(animals)
        println(animals) /* print [Cat(name=Felix), Puppy(name=Jim), Puppy(name=Beam)] */
    }
}