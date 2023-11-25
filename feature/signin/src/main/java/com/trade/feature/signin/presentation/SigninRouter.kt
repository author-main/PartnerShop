package com.trade.feature.signin.presentation

interface SigninRouter {
    fun launchSignup(email: String = "")
    fun launchMain()
}