package com.sts.rest;

import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.web.bind.annotation.RestController

public class RestController {

	@GetMapping("/m")
	public String getmData() {
		String msg="micocervice running";
		return msg;
	}
}
