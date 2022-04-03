package com.example.data.repositoryimpl.garden

import com.example.data.datasource.garden.SignInDataSource
import com.example.data.mapper.garden.SignInMapper
import com.example.data.model.request.garden.ReqSignInSuccessData
import com.example.domain.model.garden.SignInSuccessData
import com.example.domain.repository.garden.SignInRepository

class SignInRepositoryImpl(private val signInDataSource: SignInDataSource): SignInRepository {
    override suspend fun postSignInResult(body: ReqSignInSuccessData): SignInSuccessData {
        return SignInMapper.mapperToSignIn(signInDataSource.postSignIn(body))
    }
}