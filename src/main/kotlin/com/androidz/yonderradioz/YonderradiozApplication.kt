package com.androidz.yonderradioz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class YonderradiozApplication

fun main(args: Array<String>) {
    runApplication<YonderradiozApplication>(*args)
}
