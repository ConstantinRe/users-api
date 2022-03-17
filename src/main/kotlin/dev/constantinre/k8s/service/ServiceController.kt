package dev.constantinre.k8s.service

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ServiceController(private val serviceProperties: ServiceProperties) {

    @GetMapping("/users")
    fun getUsers() = serviceProperties.users

}