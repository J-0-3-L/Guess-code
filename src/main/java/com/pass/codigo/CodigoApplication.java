package com.pass.codigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class CodigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodigoApplication.class, args);
	}
	private static final String clave= "bushido";

	@GetMapping("/")
	public String home(@RequestParam(value = "error", required = false) boolean error){
		if (error==true) {
		}
		return "index";
	}

	@PostMapping("/checkCode")
    public String checkCode(@RequestParam("code") String code) {
        return code.equals(clave) ? "redirect:/code" : "redirect:/?error=true";
    }

	@GetMapping("/code")
	public String code(){
		return "page";
	}

}
