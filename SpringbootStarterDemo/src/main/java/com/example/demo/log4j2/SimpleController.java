package com.example.demo.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleController {
		private final Logger logger = LoggerFactory.getLogger(this.getClass());
		@RequestMapping("/")
		String hello() {
			logger.debug("DEbug Message");
			logger.info("Information Message");
			logger.warn("Warn message");
			logger.error("error message");
			return "Done";
		}

}
