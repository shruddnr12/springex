package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller  //anotation
public class HelloController {
	@RequestMapping( "/hello" )
	public String hello(){
		return "/WEB-INF/views/hello.jsp"; 
	}
	
	@RequestMapping( "/hello2" )
	public ModelAndView hello2(@RequestParam("n") String name){
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", name);  //setAttribute와 같음
		mav.setViewName("/WEB-INF/views/hello.jsp"); 
		return mav;
	}
	
	/*많이 쓰는 방식*/
	@RequestMapping( "/hello3" ) 
	public String hello3(Model model,
			@RequestParam("n") String name){
		
		model.addAttribute("name",name);
		return "/WEB-INF/views/hello.jsp"; 
		 
	}
	
//	/*기술이 침투 했기 때문에 비추천*/
//	@RequestMapping("/hello3") // 그냥 받을 수 있다는 걸 보여주기 위함. 쓰지 말것. 기술이 들어가면 이식성이 떨어진다. 
//	public void hello3(HttpServletRequest request, Writer out){
//		String name = request.getParameter("name");
//		try {
//			out.write("<h1>Hello" + name + "</h1>");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}



