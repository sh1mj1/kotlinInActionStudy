package effective.item37

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class PlayerTest {

    @Test
    fun testDestructuringDeclaration() {
        val player = Player(10, "sh1mj1", 100)
        val (id, name, points) = player // 순서를 제대로 지정.
        assertTrue { id == 10 && name == "sh1mj1" && points == 100 }
    }

    @Test
    fun testDestructuringDeclaration2() {
        val player = Player(10, "sh1mj1", 100)
        val (name, id, points) = player
        // 정상 작동은 되지만 경고를 보여준다.
        // Variable name 'name' matches the name of a different component
        // Variable name 'id' matches the name of a different component
        assertTrue { name == 10 && id == "sh1mj1" && points == 100 }
    }

}