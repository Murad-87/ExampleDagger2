package com.example.mydaggersample.example.di

import com.example.mydaggersample.example.data.repository.ExampleRepositoryImpl
import com.example.mydaggersample.example.domain.ExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository

//    @Provides
//    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository{
//        return impl
//    }
}
