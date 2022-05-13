package com.example.mydaggersample.example.data.datasource

import com.example.mydaggersample.example.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {


    override fun method() {
        database.method()
    }
}