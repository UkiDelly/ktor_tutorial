package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*


/**
 *  [Application] 클래스의 확장 함수로, routing을 설정하는 함수
 */
fun Application.configureRouting() {
    
    
    /**
     *  [routing] - 라우팅 플로그인
     */
    routing {
        get("/") {
            call.respondText("Hello Ktor!")
        }
    }
}
