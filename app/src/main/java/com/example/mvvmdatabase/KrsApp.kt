package com.example.mvvmdatabase

import android.app.Application
import com.example.mvvmdatabase.dependenciesinjection.ContainerApp
import com.example.mvvmdatabase.dependenciesinjection.InterfaceContainerApp

class KrsApp : Application() {
    lateinit var containerApp: InterfaceContainerApp // Fungsinya untuk menyimpan instance
    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this) //Membuat instance ContainerApp
        //instance adalah object yang dibuat dari class
    }
}