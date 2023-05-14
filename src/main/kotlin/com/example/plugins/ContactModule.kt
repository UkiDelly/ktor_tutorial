package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


/**
 *  [Application] 클래스의 확장 함수로, 커스텀 routing을 설정하는 함수
 */
fun Application.contactUsModule(){
	
	/**
	 *  [routing] - 라우팅 플로그인
	 */
	routing {

		get("/contactus"){
		call.respondText { "Contact us" }
		}
		
		get("/aboutus"){
			call.respondText { "About us" }
		}
	}
}