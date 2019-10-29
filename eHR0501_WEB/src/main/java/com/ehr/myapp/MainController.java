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
	public String hello(Model model) { //�۾��� ����� model�� ��� main/main�̶�� �� �̸��� ��ȯ�Ѵ�.
		model.addAttribute("msg", "Hello world"); //"�̸�",��ü
		LOG.debug("*****************************");
		LOG.debug("hello");
		LOG.debug("*****************************");
		
		return "main/main"; //return url --> /main/main.jsp
	}


}
