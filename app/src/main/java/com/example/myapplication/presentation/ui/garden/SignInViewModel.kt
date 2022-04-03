package com.example.myapplication.presentation.ui.garden

import android.util.Log
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.model.request.garden.ReqSignInSuccessData
import com.example.domain.model.garden.SignInSuccessData
import com.example.domain.usecase.test.PostSignInUseCase
import com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_LONG
import kotlinx.coroutines.launch

class SignInViewModel(val postSignInUseCase: PostSignInUseCase) : ViewModel() {

    private var _memberInfo = MutableLiveData<SignInSuccessData.MemberInfo>()
    val memberInfo : LiveData<SignInSuccessData.MemberInfo> = _memberInfo

    private var _email: String = ""
    var email: String = _email
        set(value) {
            _email = value
            field = value
        }

    private var _password: String = ""
    var password: String = _password
        set(value) {
            _password = value
            field = value
        }

    fun postSignIn() = viewModelScope.launch() {
        kotlin.runCatching { postSignInUseCase() }
            .onSuccess {
                _memberInfo.postValue(it.data)
                Log.d("searchResultSuccess-server", "success${it}")

            }
            .onFailure {
                it.printStackTrace()
            }
    }
}