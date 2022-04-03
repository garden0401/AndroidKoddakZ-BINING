package com.example.myapplication.di

import com.example.domain.usecase.test.GetTestUseCase
import com.example.domain.usecase.test.PostSignInUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single {GetTestUseCase(get())}
    single { PostSignInUseCase(get()) }
}
