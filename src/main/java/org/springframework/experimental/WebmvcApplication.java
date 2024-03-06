package org.springframework.experimental;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

@SpringBootApplication
public class WebmvcApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(WebmvcApplication.class).applicationStartup(new BufferingApplicationStartup(10)).run(args);
	}

}
