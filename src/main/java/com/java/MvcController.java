package com.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {
@RequestMapping("/hcl")	
public String show1(){
	System.out.println("success from HCL");
	return "hcl";
}
@RequestMapping("/tcs")	
public String show2(){
	System.out.println("success from TCS");
	return "tcs";
}
@RequestMapping("/cts")	
public String show3(){
	System.out.println("success from CTS");
	return "cts";
}
@RequestMapping("/techm")	
public String show4(){
	System.out.println("success from TECHM");
	return "techm";
}
@RequestMapping("/back")	
public String show5(){
	System.out.println("success to main page");
	return "index";
}
}
