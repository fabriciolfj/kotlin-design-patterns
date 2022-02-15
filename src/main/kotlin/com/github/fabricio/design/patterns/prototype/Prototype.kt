import com.github.fabricio.design.patterns.prototype.Role
import com.github.fabricio.design.patterns.prototype.UseCase.Companion.allUsers
import com.github.fabricio.design.patterns.prototype.User
import com.github.fabricio.design.patterns.prototype.createUser


fun main() {
    val originalUser = User("admin1", Role.ADMIN, setOf("READ", "WRITE", "DELETE"))
    allUsers += originalUser

    createUser("admin2", com.github.fabricio.design.patterns.prototype.Role.ADMIN)

    println(allUsers)
}