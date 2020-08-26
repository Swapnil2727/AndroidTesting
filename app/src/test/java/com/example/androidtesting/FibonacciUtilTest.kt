package com.example.androidtesting


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class FibonacciUtilTest{

    @Test
    fun `fib check`(){

        val result = FibonacciUtil.fib(9)
        assertThat(result).isEqualTo(21)
    }

    @Test
    fun `check braces`(){
        val result = FibonacciUtil.checkBraces("())")
        assertThat(result).isFalse()
    }
}