package com.example.mvvmsampleapps.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmsampleapps.R
import com.example.mvvmsampleapps.databinding.ActivityLoginBinding
import com.example.mvvmsampleapps.utils.toast

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)

        val viewModel: ViewModelProvider.


    }

    override fun onStarted() {
        toast("on Started")
    }

    override fun onSuccess() {
        toast("on Succes")
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}
