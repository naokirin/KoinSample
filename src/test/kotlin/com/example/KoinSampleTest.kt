package com.example

import com.example.dummy.dummy_module
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.koin.standalone.StandAloneContext.loadKoinModules
import org.koin.standalone.StandAloneContext.stopKoin
import org.koin.standalone.inject
import org.koin.test.KoinTest

class KoinSampleTest : KoinTest {

    private val commandProvider : CommandProvider by inject()
    private val randomInteger : RandomInteger by inject()

    @Before
    fun before() {
        loadKoinModules(dummy_module)
    }

    @After
    fun after() {
        stopKoin()
    }

    @Test
    fun testCommand() {
        val command = commandProvider.provide()
        assertEquals("dummy", command.run())
    }

    @Test
    fun testRandom() {
        val random = randomInteger
        assertEquals(1, random.value)
    }
}