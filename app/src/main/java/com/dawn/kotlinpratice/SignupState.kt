package com.dawn.kotlinpratice

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class SignupState {
    var id:String by mutableStateOf("")
        private set
    var password:String by mutableStateOf("")
        private set
    var passwordCheck:String by mutableStateOf("")
        private set
    var name:String by mutableStateOf("")
        private set
    var phoneNumber:String by mutableStateOf("")
        private set
    var commit:Boolean by mutableStateOf(false)
        private set

    val enableButton = id.isNotBlank() && password.isNotBlank() && passwordCheck.isNotBlank() && name.isNotBlank() && phoneNumber.isNotBlank()

    fun idChange(newValue:String){
        id = newValue
    }

    fun passwordChange(newValue:String){
        password = newValue
    }

    fun passwordCheckChange(newValue:String){
        passwordCheck = newValue
    }

    fun nameChange(newValue:String){
        name = newValue
    }

    fun phoneNumberChange(newValue:String){
        phoneNumber = newValue
    }

}