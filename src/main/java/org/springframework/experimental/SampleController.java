package org.springframework.experimental;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

	@GetMapping(path = "/")
	String user(Map<String, Object> model) {
		model.put("message", "Welcome");
		model.put("time", new Date());
		return "index";
	}

	@GetMapping(path = "/greet")
	String greet(Map<String, Object> model) {
		model.put("greeting", "Hello World");
		model.put("time", new Date());
		return "greet";
	}

	@PostMapping(path = "/greet")
	String name(Map<String, Object> model, @RequestParam String name) {
		greet(model);
		model.put("greeting", "Hello " + name);
		model.put("name", name);
		return "greet";
	}

	@PostMapping(path = "/greet", headers = "hx-request=true")
	String nameHtmx(Map<String, Object> model, @RequestParam String name) {
		name(model, name);
		return "greet :: content";
	}

}
