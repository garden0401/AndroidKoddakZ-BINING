package com.example.domain.model.garden

import com.google.gson.annotations.SerializedName

data class SignInSuccessData(
    val data: MemberInfo
) {
    data class MemberInfo(
        @SerializedName("id")
        val id: Int,
        @SerializedName("nickname")
        val username: String,
        @SerializedName("accesstoken")
        val accesstoken: String
    )
}
