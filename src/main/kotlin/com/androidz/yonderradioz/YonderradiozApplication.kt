package com.androidz.yonderradioz

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class YonderradiozApplication

fun main(args: Array<String>) {

    val springApplication = SpringApplication(YonderradiozApplication::class.java)
    val mutableMapOf = mutableMapOf<String, String>()
    val portNumber = System.getenv()["port"].toString()

    mutableMapOf["server.port"] = portNumber //8081
    println("PortNumber = $portNumber")
    springApplication.setDefaultProperties(mutableMapOf.toMap())
    springApplication.run(*args)
    //runApplication<YonderradiozApplication>(*args)
}
