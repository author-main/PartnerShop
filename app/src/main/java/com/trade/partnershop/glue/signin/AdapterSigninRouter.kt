package com.trade.partnershop.glue.signin

import com.trade.feature.signin.presentation.signin.SigninRouter

class AdapterSigninRouter: SigninRouter {
    override fun launchSignup(email: String) {
       /* val result: Try<Result> =
            Try{HttpService.SendNotification(endpointUrl)}

        when(result) {
            is Success -> MarkNotificationAsSent()
            is Failure    -> MarkNotificationAsNotSent()
        }*/
    }

    override fun launchMain() {

    }
}