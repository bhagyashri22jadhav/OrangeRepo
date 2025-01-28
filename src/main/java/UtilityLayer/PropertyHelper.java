package UtilityLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import BaseLayer.BaseClass;

public class PropertyHelper extends BaseClass{
	static Properties prop;
	
	public static String getProperty(String keyName) throws IOException
	{
	
	String path=System.getProperty("user.dir")+"\\src\\main\\java\\ConfigLayer\\config.properties";
	
	 prop=new Properties();
	
	 try 
	 {
		FileInputStream fis=new FileInputStream(path);
		prop.load(fis);
		 return prop.getProperty(keyName);
		
	} 
	 catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	 
	 return null;
	}

}




