package com.example.myapplication.presentation.ui.garden

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivitySignInBinding
import com.example.myapplication.presentation.ui.main.MainActivity
import com.nadosunbae_android.app.presentation.base.BaseActivity
import org.koin.android.compat.ScopeCompat.viewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class SignInActivity : BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {

    private val signInViewModel : SignInViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btnSignInEvent()
        observeSignInSuccess()
    }

    private fun btnSignInEvent() {
        binding.btnSignIn.setOnClickListener {

            if(binding.etSignInEmail.text.isNotEmpty() && binding.etSignInPw.text.isNotEmpty()) {
                signInViewModel.email = binding.etSignInEmail.text.toString()
                signInViewModel.password = binding.etSignInPw.text.toString()
                signInViewModel.postSignIn()
                Toast.makeText(this, "서버통신 성공", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun observeSignInSuccess() {
        signInViewModel.memberInfo.observe(this) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}