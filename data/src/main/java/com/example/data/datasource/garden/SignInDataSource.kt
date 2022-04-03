package com.example.data.datasource.garden

import com.example.data.model.request.garden.ReqSignInSuccessData
import com.example.data.model.response.garden.ResSignInSuccessData
import retrofit2.http.Body

interface SignInDataSource {
    suspend fun postSignIn(body: ReqSignInSuccessData): ResSignInSuccessData
}