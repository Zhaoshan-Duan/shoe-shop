package com.udacity.shoestore.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentLoginBinding = DataBindingUtil
            .inflate(inflater, R.layout.fragment_login, container, false)

        binding.loginButton.setOnClickListener{
            // to weclome fragment
            it.findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)

        }

        binding.signinButton.setOnClickListener{
            // to weclome fragment
            it.findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)
        }


        return binding.root
    }
}