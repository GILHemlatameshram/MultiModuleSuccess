package com.qa.util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper {
	private static boolean root;
	
	public static Logger getLogger(Class cls)
	{	
		if (root)
		{
		return Logger.getLogger(cls);	
		}
		
		PropertyConfigurator.configure("D:/MyStudy/JITAutomationBdd/src/main/java/com/qa/config/log4j.properties");
		root=true;
		return Logger.getLogger(cls);
	}
}
