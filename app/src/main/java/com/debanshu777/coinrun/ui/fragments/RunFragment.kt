package com.debanshu777.coinrun.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.debanshu777.coinrun.R
import com.debanshu777.coinrun.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run) {

    private val viewModel:MainViewModel by viewModels()
}