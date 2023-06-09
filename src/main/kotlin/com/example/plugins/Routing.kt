package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import kotlinx.serialization.Serializable


/**
 *  [Application] 클래스의 확장 함수로, routing을 설정하는 함수
 */
fun Application.configureRouting() {
    
    
    /**
     *  [routing] - 라우팅 플로그인
     */
    routing {
        get("/") {
            /**
             *  [call] - 요청에 대한 정보를 담고 있는 객체
             *
             */
            call.respondText("Hello Ktor!")
        }
        
        
        // {param} - 파라미터를 의미
        get("/iphones/{page}"){
            
            // param 가져오기
            val page = call.parameters["page"]
            
            call.respondText { "You are on page number: $page" }
        }
        
        post ("/login"){
            
            //* body 가져와서 해당 타입으로 변환
            val body = call.receive<UserInfo>()
            
            println(body)
            call.respondText("Everything working...") }
    }
}



@Serializable
data class UserInfo(val email:String, val password:String)