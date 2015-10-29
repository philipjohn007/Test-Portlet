package com.liferay.test.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class SampleRestController {

	@RequestMapping(value = "/helloSample", method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String helloSample() {
		return "Finally!";
	}
}
