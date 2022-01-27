package com.github.fabricio.design.prototype

data class User(
        val name: String,
        val role: Role,
        private val permissions: Set<String>,
) {
    fun hasPermission(permission: String) = permission in permissions
}