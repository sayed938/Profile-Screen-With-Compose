package com.example.profilescreen.viewmodels

import androidx.lifecycle.ViewModel
import com.example.profilescreen.viewmodels.state.ProfileUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

@HiltViewModel
class ProfileViewModel : ViewModel() {
    private val _profileState = MutableStateFlow(ProfileUIState())
    val profileState = _profileState.asStateFlow()
    fun onChangedName(name: String) {
        _profileState.update { it.copy(name = name) }
    }

    fun onChangedEmail(email: String) {
        _profileState.update { it.copy(email = email) }
    }

    fun onChangedBirth(birth: String) {
        _profileState.update { it.copy(birth = birth) }
    }
    fun saveUserData() {
        //Save User Data
    }
}