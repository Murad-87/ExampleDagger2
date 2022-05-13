package com.example.mydaggersample.example.data.repository

import com.example.mydaggersample.example.data.datasource.ExampleLocalDataSource
import com.example.mydaggersample.example.data.datasource.ExampleRemoteDataSource
import com.example.mydaggersample.example.data.mapper.ExampleMapper
import com.example.mydaggersample.example.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {
    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}