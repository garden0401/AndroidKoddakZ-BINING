package com.example.data.datasource.garden

import com.example.data.api.GardenService
import com.example.data.model.request.garden.ReqSignInSuccessData
import com.example.data.model.response.garden.ResSignInSuccessData

class SignInDataSourceImpl(private val gardenService: GardenService) : SignInDataSource {
    override suspend fun postSignIn(body: ReqSignInSuccessData): ResSignInSuccessData {
        return gardenService.postSignIn(body)
    }
}