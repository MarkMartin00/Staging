package com.revature.service;

import org.springframework.stereotype.Service;

import com.revature.model.Boxes;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service 
public class ItemService {
	
	Boxes box = new Boxes();
	
	//These worked in training. It needs debugged.
//	Boxes largeBoxes = Boxes.builder().name("Large").monies(4).descrption("Large moving box").size("10 x 10").build();
//	
//	Boxes mediumBoxes = Boxes.builder().name("Large").monies(4).descrption("Large moving box").size("10 x 10").build();
	
	public static void logLogging() {
		try {
//			Logger.debug("Test debug");
//			Logger.info("Adding another level");
		} catch (Exception exception) {
//			Logger.error("This is an exception log in Boxes: "+ exception);
		}
	}
	
	//@CleanUp annotation allows for recources like BuffedWriter or Scanner to automaticially close
	//	before exiting the current scope to save resources.
	
	//@Log logging library annotation used for logs. Here's a list.
	//	@CommonsLog	=	org.apache.commons.logging.Logs
	//	@Flogger	=	com.google.common.flogger.FluentLogger
	//	@JBossLog	=	org.jboxx.logging.Logger
	//	@Log		=	org.util.logging.Logger
	//	@Log4j		=	org.apache.log4j.Logger
	//	@Log4j2		=	org.apache.logging.log4j.Logger
	//	@Slf4j		=	org.slf4j.Logger log
	//	@XSlf4j		=	org.slf4j.ext.XLogger
	
}
