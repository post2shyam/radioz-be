package com.androidz.yonderradioz

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @RequestMapping("/")
    fun home(): String {
        return "The Yonder Radioz"
    }
}