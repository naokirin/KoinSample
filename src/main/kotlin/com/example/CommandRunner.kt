package com.example

import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class CommandRunner : KoinComponent {

    private val commandProvider: CommandProvider by inject()

    fun run() : String {
        val command = commandProvider.provide()
        return command.run()
    }
}