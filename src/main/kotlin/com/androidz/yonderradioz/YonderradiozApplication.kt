package com.androidz.yonderradioz

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class YonderradiozApplication

fun main(args: Array<String>) {
    val springApplication: SpringApplication = SpringApplication(YonderradiozApplication::class.java)
    val mutableMapOf = mutableMapOf<String, String>()
    mutableMapOf["server.port"] = System.getenv()["port"].toString()

    springApplication.setDefaultProperties(mutableMapOf.toMap())
    runApplication<YonderradiozApplication>(*args)
}
