package com.trade.feature.signin.presentation.signin

interface SigninRouter {
    fun launchSignup(email: String = "")
    fun launchMain()
}