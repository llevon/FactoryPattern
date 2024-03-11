package org.example

fun main() {
    println(Computer.factory("Razer"))
}

interface Computer {
    companion object {
        fun factory(name: String): Computer {
            return when (name) {
                "Asus" -> Asus()
                "Lenovo" -> Lenovo()
                "Razer" -> Razer()
                else -> throw Exception()
            }

        }
    }
}

class Asus : Computer
class Razer : Computer
class Lenovo : Computer
