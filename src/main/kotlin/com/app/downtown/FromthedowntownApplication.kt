package com.app.downtown

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class FromthedowntownApplication

fun main(args: Array<String>) {
    runApplication<FromthedowntownApplication>(*args)
}
