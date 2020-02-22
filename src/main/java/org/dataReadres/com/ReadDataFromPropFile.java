package org.dataReadres.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropFile {

	//@Test
	public String readDataFromPropFile(String key) throws Exception{

		String projectPath = System.getProperty("user.dir");
		
		String propFilePath = projectPath + "//data//data.properties";
		
		File file = new File(propFilePath);
		
		FileInputStream fIp = new FileInputStream(file);
		
		Properties prop = new Properties();
		
		prop.load(fIp);
		
		String value = prop.getProperty(key);
		
		System.out.println(value);
		
		return value;
		
	}
}
