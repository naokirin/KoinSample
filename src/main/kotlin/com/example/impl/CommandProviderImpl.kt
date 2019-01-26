package com.example.impl

import com.example.Command
import com.example.CommandProvider

class CommandProviderImpl(private val command: Command): CommandProvider {
    override fun provide(): Command = command
}