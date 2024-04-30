package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/sample")
public class SampleContrller2 {

	@GetMapping("/all")
	public void doAll() {
		log.info("all..................");
	}
	
	@GetMapping("/member")
	public void doMember() {
		log.info("member..................");
	}

	@GetMapping("/admin")
	public void doAdmin() {
		log.info("admin..................");
	}
}
