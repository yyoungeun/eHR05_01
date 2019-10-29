package com.ehr.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	private Logger LOG= LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping("main/main.do")
	public String hello(Model model) { //작업의 결과를 model에 담고 main/main이라는 뷰 이름을 반환한다.
		model.addAttribute("msg", "Hello world"); //"이름",객체
		LOG.debug("*****************************");
		LOG.debug("hello");
		LOG.debug("*****************************");
		
		return "main/main"; //return url --> /main/main.jsp
	}


}
