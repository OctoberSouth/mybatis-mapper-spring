package com.box.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.box.service.TestService;
import com.box.utils.Json;

@Controller
@RequestMapping("/testController")
public class TestController {

	protected static final Logger LOG = Logger.getLogger(TestController.class);

	@Resource(name = "testService")
	TestService testService;

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	@ResponseBody
	public Json showUser(HttpServletRequest request, HttpServletResponse response,Integer id) {
		response.setHeader("Content-Type", "text/html; charset=utf-8");
		response.setCharacterEncoding("utf-8");
		LOG.info("/tese.json进入");
		Json json = new Json();
		try {
			json.setData(this.testService.insert(id));
			json.setReturnCode(Json.SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMessage(e.getMessage());
			json.setReturnCode(Json.ERROR);
		}
		return json;
	}
}
