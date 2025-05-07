package vottega.auth_server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class AuthServerApplication

fun main(args: Array<String>) {
  runApplication<AuthServerApplication>(*args)
}
