package com.androidz.yonderradioz

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @RequestMapping("/")
    fun home(): String {
        return "The Yonder Radioz"
    }

    @RequestMapping("/firststation")
    fun firstStation(): String {
        return "https://0n-90s.radionetz.de/0n-90s.mp3"
    }
}