#!/usr/bin/env kotlin

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>,turnon()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}