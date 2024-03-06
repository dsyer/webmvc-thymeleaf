package org.springframework.experimental;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

	@GetMapping(path = "/")
	String user(Map<String, Object> model) {
		model.put("greeting", "Hello World");
		model.put("time", new Date());
		return "index";
	}

}
