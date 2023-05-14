package com.example

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    
    
    /**
     *  [Netty] - Netty 서버 엔진을 사용하는 것을 의미
     *  [port] - 서버가 사용할 포트를 지정
     *  [host] - 서버가 사용할 호스트를 지정
     *  [module] - 서버가 사용할 모듈을 지정
     *  [start] - 서버를 시작
     *  [wait] - 서버가 시작되고 난 후에 블로킹을 할지 여부를 지정
     *  [embeddedServer] - 서버를 생성
     *  Application::module의 의미는 module인자에 Application의 module 함수의 참조를 넘겨준다는 의미
     */
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}


/**
 * 서버가 사용할 모듈을 지정하는 등록하는 함수, [Application]의 확장함수
 *
 */
fun Application.module(): Unit {
    
    // [Application.configureRouting] 함수를 호출
    configureRouting()
    
}

