package com.mms.mms

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
@RequestMapping("/api/status")
class Api {
    @GetMapping
    fun health() : String {
        return "200 ok"
    }
}


