package com.example.dummy

import com.example.RandomInteger
import kotlin.random.Random

class RandomIntegerDummy : RandomInteger {
    private val _value = 1
    override val value : Int
        get() = _value
}
