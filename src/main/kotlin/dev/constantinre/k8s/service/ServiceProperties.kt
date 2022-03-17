package dev.constantinre.k8s.service

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "service")
class ServiceProperties {
    var users = listOf<User>()
}