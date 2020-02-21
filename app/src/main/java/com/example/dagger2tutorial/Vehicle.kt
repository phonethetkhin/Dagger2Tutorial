package com.example.dagger2tutorial

import javax.inject.Inject


 class Vehicle @Inject constructor(private val motor: Motor) {
    fun increaseSpeed(value: Int) {
        motor.accelerate(value)
    }

    fun decreaseSpeed(value: Int) {
        motor.decelerate(value)
    }

    fun stop() {
        motor.brake()
    }

    val speed: Int
        get() = motor.rpm

}