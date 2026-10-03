#!/usr/bin/env kotlin
interface clickable {

    val name: String =
    fun click()

    class Button (override val name: String) : Clickable {
        override fun click() {
            println ("Tombol '$name' berhasil diklik!")

        }
    }

}
