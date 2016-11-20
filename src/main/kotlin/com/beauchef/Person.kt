package com.beauchef

interface Signatory {
    fun sign()
}

open class Person(val name: String, var age: Int, var isMarried: Boolean = false) : Signatory {

    var parterName: String = ""

    override fun sign() = println("$name aged $age can sign documents (marital status $isMarried)")

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p = Student("J-F", 21)
            p.sign()
            p.age = 43
            p.sign()
            p.parterName = "Jane"
            println("Partner name is ${p.parterName}")
        }
    }
}

class Student(name: String, age: Int) : Person(name, age)
