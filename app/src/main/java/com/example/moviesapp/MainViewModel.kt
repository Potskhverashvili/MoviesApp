package com.example.moviesapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _isReady = MutableStateFlow(false)
    val isReady = _isReady.asStateFlow()


    init {
        viewModelScope.launch{
            delay(3000L)
            _isReady.value = true
        }
    }
}