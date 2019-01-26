package com.example.dummy

import com.example.CommandProvider
import com.example.RandomInteger
import org.koin.dsl.module.module

val dummy_module = module {
    single<CommandProvider> { CommandProviderDummy() }

    factory<RandomInteger> { RandomIntegerDummy() }
}