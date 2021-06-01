package com.debanshu777.coinrun.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.debanshu777.coinrun.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
):ViewModel(){
}