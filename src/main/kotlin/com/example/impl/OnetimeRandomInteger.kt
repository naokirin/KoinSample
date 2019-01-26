package com.example.impl

import com.example.RandomInteger
import kotlin.random.Random

class OnetimeRandomInteger : RandomInteger {
    private val _value = Random.nextInt()
    override val value : Int
        get() = _value
}
