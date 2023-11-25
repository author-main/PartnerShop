package com.trade.feature.signin.presentation.signin

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trade.feature.signin.R

class SigninFragment : Fragment() {

    //private val binding by viewBinding<FragmentSigninBinding>()

    private val viewModel by viewModels<SigninViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_signin, container, false)
    }

}