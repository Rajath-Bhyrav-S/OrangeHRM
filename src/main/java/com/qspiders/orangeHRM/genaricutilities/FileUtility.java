package com.qspiders.orangeHRM.genaricutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{
	public String readCommonData(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream("./src/test/sources/Data.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	
	}

}
