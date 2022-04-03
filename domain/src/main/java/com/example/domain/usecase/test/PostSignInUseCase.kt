package com.example.domain.usecase.test

import com.example.domain.model.garden.SignInSuccessData
import com.example.domain.repository.garden.SignInRepository

class PostSignInUseCase(private val signInRepository: SignInRepository) {
    suspend operator fun invoke() : SignInSuccessData {
        return signInRepository.postSignInResult(ReqSignInSuccessData)
    }
}