package com.example.android.dessertclicker

import android.app.Application
import timber.log.Timber

//Application clase base que contiene el estado de la aplicación global para toda su aplicación.
//objeto principal que utiliza el sistema operativo para interactuar con su aplicación.
//Por lo general Android la crea, en este caso, como se necesita inicializar la libreria de Timber
//antes de lo demás, se una clase que herede de application para personalizarla

//  Para que Android sepa usar su Application clase en lugar de la predeterminada. se configura en el
//Manifest android:name=".ClickerApplication"

class ClickerApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        //Se inicializa la biclioteca de Timber
        Timber.plant(Timber.DebugTree())
    }
}