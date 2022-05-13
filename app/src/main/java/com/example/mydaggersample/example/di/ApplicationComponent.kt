package com.example.mydaggersample.example.di

import android.content.Context
import com.example.mydaggersample.example.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [DataModule::class, DomainModule::class]
)
interface ApplicationComponent {

    fun inject(activity: MainActivity)


    // После последнего обновления в Dagger  такой вариант редко используется
    // Чаще всего используют вариант с Factory
//    @Component.Builder
//    interface ApplicationComponentBuilder{
//
//        @BindsInstance
//        fun context(context: Context): ApplicationComponentBuilder
//
//        @BindsInstance
//        fun timeMillis(timeMillis: Long): ApplicationComponentBuilder
//
//        fun build(): ApplicationComponent
//    }

    //Предпочтительно использовать такой варинат создания билдера
    @Component.Factory
    interface ApplicationBuilderFactory{

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }
}