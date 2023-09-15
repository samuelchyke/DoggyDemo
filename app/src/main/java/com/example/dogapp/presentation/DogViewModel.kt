package com.example.dogapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dogapp.network.NetworkRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DogViewModel @Inject constructor(
    private val networkRepository: NetworkRepository
) : ViewModel() {

    fun searchDogs() = viewModelScope.launch {
        networkRepository.getListOfDogs()
    }
}




