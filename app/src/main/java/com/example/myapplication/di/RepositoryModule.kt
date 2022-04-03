package com.example.myapplication.di

import com.example.data.repositoryimpl.garden.SignInRepositoryImpl
import com.example.data.repositoryimpl.sign.SignRepositoryImpl
import com.example.data.repositoryimpl.test.TestRepositoryImpl
import com.example.domain.repository.garden.SignInRepository
import com.example.domain.repository.sign.SignRepository
import com.example.domain.repository.test.TestRepository
import org.koin.dsl.module

val repositoryModule = module {

    single<SignRepository>{ SignRepositoryImpl(get()) }
    single<TestRepository>{ TestRepositoryImpl(get())}
    single<SignInRepository> { SignInRepositoryImpl(get())}

}
