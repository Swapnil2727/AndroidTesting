package com.example.androidtesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparorTest{

    private lateinit var resourceComparer: ResourceComparor
    @Before
    fun setUp()
    {
        //this will run before every Test
        resourceComparer = ResourceComparor()
    }

    @After
    fun tearDown()
    {
        //if we are using DB than have to close after each test
    }

    @Test
    fun compareStringResource(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_test,"TEST STRING")

        assertThat(result).isTrue()
    }

    @Test
    fun compareDifferentStringResource(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_test,"TEST Different STRING")

        assertThat(result).isFalse()
    }
}