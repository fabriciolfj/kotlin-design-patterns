package com.github.fabricio.design.patterns.prototype

data class User(
        val name: String,
        val role: com.github.fabricio.design.patterns.prototype.Role,
        private val permissions: Set<String>,
) {
    fun hasPermission(permission: String) = permission in permissions
}