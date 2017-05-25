package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/* request mapping (type + method) */
@Controller
@RequestMapping("/user")
public class UserController {
	//UserDao dao = new UserDao(); 이젠 이런 생성을 우리가 하는게 아니고 IOC로 container에서 생성하고 가져다 쓴다. 그게 DI(의존성 주입)이다.
	
	@ResponseBody
	@RequestMapping("/joinform")
	public String joinform(){
		return "UserController:joinform";
	}
	
	@ResponseBody
	@RequestMapping({"/join","/dojoin"})   // url과 method가 같을 필요는 없지만 같으면 보기 좋을껄?ㅋ 
	public String doJoin(){
		return "UserController:doJoin";
	}
	
	@RequestMapping(value = {"/login","/l" }, method=RequestMethod.GET ) 
	public String login(){
		return "/WEB-INF/views/login.jsp";
	}
	
//	@ResponseBody
//	@RequestMapping(value = "/login", method=RequestMethod.POST ) // login으로 들어오는데 post방식으로 들어올때
//	public String login(String email,String password){
//		return "UserController:login(String,String)";
//	}
	
//	@ResponseBody
//	@RequestMapping(value = "/login", method=RequestMethod.POST ) // login으로 들어오는데 post방식으로 들어올때
//	public String login(
////			@RequestParam(value="email", required= true, defaultValue = "") String email,
////			@RequestParam(value="password", required= true, defaultValue = "") String password,
//			@ModelAttribute UserVo userVo){
//		System.out.println(userVo);
//		return "UserController:login(String,String)";
//	}

	@RequestMapping(value = "/login", method=RequestMethod.POST ) // login으로 들어오는데 post방식으로 들어올때
	public String login(
//			@RequestParam(value="email", required= true, defaultValue = "") String email,
//			@RequestParam(value="password", required= true, defaultValue = "") String password,
			@ModelAttribute UserVo userVo){
		System.out.println(userVo);
		return "redirect:/main";
	}
	
}
