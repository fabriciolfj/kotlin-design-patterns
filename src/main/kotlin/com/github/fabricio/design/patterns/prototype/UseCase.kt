package com.github.fabricio.design.patterns.prototype

import com.github.fabricio.design.patterns.prototype.UseCase.Companion.allUsers


class UseCase {
    companion object {
        val allUsers = mutableListOf<User>()
    }
}


fun createUser(_name: String, role: com.github.fabricio.design.patterns.prototype.Role) {
    for (u in allUsers) {
        if (u.role == role) {
            allUsers += u.copy(name = _name)
            return
        }
    }
    // Handle case that no other user with such a role exists
}