import com.github.fabricio.design.prototype.Role
import com.github.fabricio.design.prototype.UseCase.Companion.allUsers
import com.github.fabricio.design.prototype.User
import com.github.fabricio.design.prototype.createUser


fun main() {
    val originalUser = User("admin1", Role.ADMIN, setOf("READ", "WRITE", "DELETE"))
    allUsers += originalUser

    createUser("admin2", Role.ADMIN)

    println(allUsers)
}