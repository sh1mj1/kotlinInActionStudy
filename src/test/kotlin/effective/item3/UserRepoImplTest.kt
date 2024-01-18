package effective.item3

import org.junit.jupiter.api.Test

class UserRepoImplTest {
    @Test
    fun getUserName() {
        val repo: UserRepo = UserRepoImpl()
        val text: String = repo.getUserName()
        println("User name length is ${text.length}") // NPE 발생
    }
}