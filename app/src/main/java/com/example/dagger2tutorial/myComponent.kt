package com.example.dagger2tutorial

import MyModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [MyModule::class])
 interface MyComponent {
    fun provideVehicle(): Vehicle?
    fun inject(main: MainActivity?)
}