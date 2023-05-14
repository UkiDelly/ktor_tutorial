package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*


/**
 *  [Application] 클래스의 확장 함수로, routing을 설정하는 함수
 */
fun Application.configureRouting() {
    
    
    /**
     *  [routing] - 라우팅 플로그인
     */
    routing {
        get("/") {
            // uri 가져오기
            println("URI: ${call.request.uri}") // '/' 출력
            
            // header 가져오기
            println("Headers: ${call.request.headers.names()}")
            println("User-Agent: ${call.request.headers["User-Agent"]}")
            println("Accept: ${call.request.headers["Accept"]}")
            
            // query parameter 가져오기
            println("Query Parameters: ${call.request.queryParameters.names()}")
            println("Id Parameters: ${call.request.queryParameters["id"]}")
            
            
            
            /**
             *  [call] - 요청에 대한 정보를 담고 있는 객체
             *
             */
            call.respondText("Hello Ktor!")
            
            
            
            
        }
    }
}
