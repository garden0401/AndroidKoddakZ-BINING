package com.example.data.api

import com.example.data.model.request.garden.ReqSignInSuccessData
import com.example.data.model.response.garden.ResSignInSuccessData
import retrofit2.http.Body
import retrofit2.http.POST

interface GardenService {
    //postSignIn
    @POST("/auth/login/email")
    suspend fun postSignIn(
        @Body body: ReqSignInSuccessData
    ): ResSignInSuccessData
}