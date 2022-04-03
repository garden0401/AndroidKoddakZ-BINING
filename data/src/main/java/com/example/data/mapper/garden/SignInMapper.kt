package com.example.data.mapper.garden

import com.example.data.model.response.garden.ResSignInSuccessData
import com.example.domain.model.garden.SignInSuccessData

object SignInMapper {

    fun mapperToSignIn(resSignInSuccessData: ResSignInSuccessData): SignInSuccessData {
        return SignInSuccessData(
            data = SignInSuccessData.MemberInfo
                (resSignInSuccessData.data.id,
                resSignInSuccessData.data.username,
                resSignInSuccessData.data.accessToken)
        )
    }
}