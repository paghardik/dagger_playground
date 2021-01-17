package com.dagger.di

import com.dagger.storage.SharedPreferencesStorage
import com.dagger.storage.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class StorageModule {

    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
}
