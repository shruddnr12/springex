package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@ResponseBody
	@RequestMapping("/write")
	public String write
	(@RequestParam (value = "n", required=true, defaultValue = "nogang") String name ,   // 꼴통들이 n의 값을 않넣었을때 default 설정하기. 그리고 ,를 써주면 몆개든 가능하다.
     @RequestParam(value ="age", required = true , defaultValue = "10" ) int age){       //원래라면 String으로 받아오지만 매개변수 타입을 보고 자동으로 int로 형변환을 해준다. // 조심할것은 anotation 전부 int형이여야한다. 
		/* @RequestParam("n") String name */
		System.out.println("name: " + name + " age: " + age);
		return "BoardController:write()";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam String name){  //매개변수와 파라미터의 이름이 같다면 생략이 가능하다.잘안씀. /board/write?name=이곳에 뭐가 올지 받기
		/*@RequestParam ("name") String name 이렇게 명확히 표시하는 것을 권장한다!!!! */
		System.out.println("name: " + name);
		return "BoardController:update()";
	}
	
	@ResponseBody
	@RequestMapping("/view/{no}")
	public String view(@PathVariable("no") Long no){   //"/view/{no}"와 @PathVariable("no")는 같아야 한다.
		return "BoardController:view" + no;
	}
	
	
}
