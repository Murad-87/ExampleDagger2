package com.example.mydaggersample.example.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mydaggersample.R
import com.example.mydaggersample.example.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        DaggerApplicationComponent.factory()
            .create(application, System.currentTimeMillis())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val activity = Activity()
//        activity.computer.toString()
        viewModel.method()
    }
}