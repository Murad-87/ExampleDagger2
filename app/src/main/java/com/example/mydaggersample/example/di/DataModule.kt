package com.example.mydaggersample.example.di

import android.content.Context
import com.example.mydaggersample.example.data.datasource.ExampleLocalDataSource
import com.example.mydaggersample.example.data.datasource.ExampleLocalDataSourceImpl
import com.example.mydaggersample.example.data.datasource.ExampleRemoteDataSource
import com.example.mydaggersample.example.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    //С интерфейсами лучше всего использовать аннотацию @Binds.
    // При использовании аннотации @Binds функции должны быть абстрактными, как и сам класс.
    //При таком варианте у нас меньше работы под капотом при создании зависимостей.
    //Если в классе все методы будут @Binds, то Dagger даже не создаст экземпляр этого класса.
    //Dagger под капотом будет знать, что нужно для реализации данного интерфейса.
    //Генирирование кода меньше и сборка проекта быстрее.
    //Если в классе все методы абстрактные то класс можно сделать интерфейсом и убрать приставки abstract
    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

//    @Provides
//    fun provideContext(): Context{
//        return context
//    }
//
//    @Provides
//    fun provideExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
//        return impl
//    }
//
//    @Provides
//    fun provideExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
//        return impl
//    }
}