package com.example.dummy

import com.example.Command
import com.example.CommandProvider

class CommandProviderDummy: CommandProvider {
    override fun provide(): Command = CommandDummy()
}