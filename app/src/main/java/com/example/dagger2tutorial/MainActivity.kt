package com.example.dagger2tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
@Inject
lateinit var vehicle: Vehicle
    @Inject
    lateinit var motor: Motor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vehicle.stop()
        motor.brake()
    }
}
