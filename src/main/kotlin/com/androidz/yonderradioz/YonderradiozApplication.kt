package com.androidz.yonderradioz

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class YonderradiozApplication

fun main(args: Array<String>) {
    val springApplication = SpringApplication(YonderradiozApplication::class.java)
    val mutableMapOf = mutableMapOf<String, String>()

    //Get port number from Heroku's System environment
    val envPortNumber = System.getenv()["PORT"]
    val portNumber = envPortNumber ?: "8080"  //if port info not present in system, default to 8080

    //Refer: https://stackoverflow.com/questions/14322989/first-heroku-deploy-failed-error-code-h10
    //Refer: https://www.baeldung.com/spring-boot-change-port
    mutableMapOf["server.port"] = portNumber
    println("PortNumber = $portNumber")
    springApplication.setDefaultProperties(mutableMapOf.toMap())
    springApplication.run(*args)
    //runApplication<YonderradiozApplication>(*args)
}
