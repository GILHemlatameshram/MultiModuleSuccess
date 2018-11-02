package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBaseApi {
	public Properties prop;
	public int RESPONSE_STATUS_CODE_200 = 200;
	public int RESPONSE_STATUS_CODE_201 = 201;
	public int RESPONSE_STATUS_CODE_400 = 400;
	public int RESPONSE_STATUS_CODE_401 = 401;
	public int RESPONSE_STATUS_CODE_500 = 500;

	public TestBaseApi() {
		try {
			System.out.println("**************User directory ------------ "+System.getProperty("user.dir"));
//			FileInputStream ip = new FileInputStream(
//					System.getProperty("user.dir") + "/JIT_Core_Framework/src/main/java/com/qa/config/Config.properties");
			
			FileInputStream ip = new FileInputStream("D:/MyStudy/BDD/JITAutomation/JIT_Core_Framework/src/main/java/com/qa/config/Config.properties");
			prop = new Properties();
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}