package com.avinash.mynotes

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}