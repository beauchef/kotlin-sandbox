package com.beauchef

fun main(args: Array<String>) {
    getAllProviders{
        key, value -> println("\t--- $key: $value")
    }
}

fun getAllProviders(fn: (String, String) -> Unit) {
    val allProviders = Providers.getProviders()
    allProviders.forEach { p ->
        run {
            println(p.name)
            p.forEach { t, u -> fn(t.toString(), u.toString()) }
        }
    }
}