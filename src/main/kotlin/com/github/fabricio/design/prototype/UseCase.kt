package com.github.fabricio.design.prototype

import com.github.fabricio.design.prototype.UseCase.Companion.allUsers

class UseCase {
    companion object {
        val allUsers = mutableListOf<User>()
    }
}


fun createUser(_name: String, role: Role) {
    for (u in allUsers) {
        if (u.role == role) {
            allUsers += u.copy(name = _name)
            return
        }
    }
    // Handle case that no other user with such a role exists
}