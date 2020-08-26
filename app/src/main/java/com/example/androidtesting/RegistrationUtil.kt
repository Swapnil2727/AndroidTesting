package com.example.androidtesting

object RegistrationUtil {

    /** the input is not valid if
     * Username is already taken
     * Password and confirmpassword do not match
     * username and password is empty
     * password have less than 2 digits
     */
    private val existingUsers = listOf("Saumil","Manan")

    fun validateRegistrationInput(
        username:String,
        password:String,
        confirmPassword:String
    ):Boolean{

        if(username in existingUsers){
            return false
        }
        if(password != confirmPassword){
            return false
        }
        if(username.isEmpty()||password.isEmpty()){
            return false
        }
        if(password.count{ it.isDigit()} < 2){
            return false
        }
        return true
    }
}