package utils;

import org.apache.logging.log4j.*;

public class Log4j {
	
	private static Logger Log = LogManager.getLogger(Log4j.class.getName());
	
	public static void main(String[] args) {
		
		Log.debug("I am debug.");
		Log.info("I am info.");
		Log.error("I am error.");
		Log.fatal("I am fatal.");
				
	}

}
