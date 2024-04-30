package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/sample")
public class SampleConroller2 {

	@GetMapping("/all")   //모든 사용자 호출
	public void doAll() {
		log.info("all.............");		
	}
	
	@GetMapping("/member")  //멤버회원들만 호출가능
	public void doMember() {
		log.info("member.............");		
	}
	
	@GetMapping("/admin")  //관리자만 호출가능
	public void doAdmin() {
		log.info("admin.............");		
	}
}
