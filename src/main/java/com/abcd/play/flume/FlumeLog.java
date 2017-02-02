package com.abcd.play.flume;

import org.apache.log4j.Logger;

public class FlumeLog {
	public static void main(String[] args)  
    {  
        Logger logger = Logger.getLogger(FlumeLog.class);  
        logger.info("hello world");  
        logger.info("My name is liuxb");  
        logger.info("How are you?");
    }

}
