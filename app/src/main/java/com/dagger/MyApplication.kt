package com.dagger

import android.app.Application
import com.dagger.di.AppComponent
import com.dagger.di.DaggerAppComponent
import com.dagger.storage.SharedPreferencesStorage
import com.dagger.user.UserManager

open class MyApplication : Application() {

    // Instance of the AppComponent that will be used by all the Activities in the project
    val appComponent: AppComponent by lazy {
        // Creates an instance of AppComponent using its Factory constructor
        // We pass the applicationContext that will be used as Context in the graph
        DaggerAppComponent.factory().create(applicationContext)
    }

    open val userManager by lazy {
        UserManager(SharedPreferencesStorage(this))
    }
}
