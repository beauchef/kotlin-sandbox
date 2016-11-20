package com.beauchef

data class User(val id: Int, val name: String)

fun main(args: Array<String>) {
    val user = User(1, "J-F")
    println(user)
    val (id, name) = user
    println("User is $name and their ID is $id")
    val otherUser = user.copy(id = 2)
    println(otherUser)
}