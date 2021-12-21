package com.example.backend

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["http://localhost:3000"])
@RequestMapping("hello")
@RestController
class HelloController {
    @GetMapping
    fun hello(): Hello {
        return Hello("hello")
    }
}

data class Hello(val greet: String)
