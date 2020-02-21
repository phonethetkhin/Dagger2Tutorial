package com.example.dagger2tutorial

 class Motor {
    var rpm = 0
        private set

    fun accelerate(value: Int) {
        rpm += value
    }

    fun decelerate(value: Int) {
        rpm -= value
    }

    fun brake() {
        rpm = 0
    }

}