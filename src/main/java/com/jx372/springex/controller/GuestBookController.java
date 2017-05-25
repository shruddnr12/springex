package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*request mapping (type 단독매핑) */

@Controller
@RequestMapping( "/guestbook/*" )   // @RequestMapping("/join")을 *로 생략시킨거. 하지만!! 명확하게 @RequestMapping("/join")를 써주는게 낫다.
public class GuestBookController {
	
	@ResponseBody
	@RequestMapping
	public String list(){
		return "GuestBookController:list()";
	}
}
