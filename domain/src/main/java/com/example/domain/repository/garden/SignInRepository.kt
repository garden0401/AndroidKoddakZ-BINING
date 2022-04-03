package com.example.domain.repository.garden

import com.example.domain.model.garden.SignInSuccessData
import retrofit2.http.Body

interface SignInRepository {
    suspend fun postSignInResult(body: ReqSignInSuccessData): SignInSuccessData
}