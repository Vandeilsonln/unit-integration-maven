package com.vaneilson.itut.integration

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GenericIT {

    @Test
    fun `hello world integration test`() {
        print("Hello, this is my Integration Test")
    }
}