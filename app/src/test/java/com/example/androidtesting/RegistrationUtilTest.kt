package com.example.androidtesting


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `username check`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Saumil",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password match check`(){

        val result = RegistrationUtil.validateRegistrationInput(
            username = "Philip",
            password = "abcde123",
            confirmPassword = "abcde123"
        )
        assertThat(result).isTrue()
    }
    @Test
    fun `username password empty check`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "",
            password = "",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password digit check`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Philip",
            password = "abcde23",
            confirmPassword = "abcde23"
        )
        assertThat(result).isTrue()
    }



}