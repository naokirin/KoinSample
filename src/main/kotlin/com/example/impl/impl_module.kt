package com.example.impl

import com.example.Command
import com.example.CommandProvider
import com.example.RandomInteger
import org.koin.dsl.module.module

val impl_module = module {
    single<Command> { CommandImpl() }
    single<CommandProvider> { CommandProviderImpl(get()) }

    factory<RandomInteger> { OnetimeRandomInteger() }
}