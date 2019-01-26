package com.example

import com.example.impl.impl_module
import org.koin.standalone.StandAloneContext.startKoin

fun main(args: Array<String>) {
    startKoin(listOf(impl_module))

    val commandRunner = CommandRunner()
    println("Running at ${commandRunner.run()}")
    println()

    val randomGenerator = RandomGenerator()
    println("Generate random value")
    println(randomGenerator.get())
    println(randomGenerator.get())
    println()

    val randomGenerator2 = RandomGenerator()
    println("Generate random value")
    println(randomGenerator2.get())
}
