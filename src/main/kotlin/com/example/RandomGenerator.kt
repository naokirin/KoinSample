package com.example

import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class RandomGenerator : KoinComponent {

    private val randomInteger : RandomInteger by inject()

    fun get() = randomInteger.value
}