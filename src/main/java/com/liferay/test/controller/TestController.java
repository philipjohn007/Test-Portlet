package com.liferay.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

@Controller
@RequestMapping("VIEW")
public class TestController {

	@RenderMapping
	public String defaultView() throws SystemException, PortalException {
		return "view";
	}
}
