package utils;

import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile {
	
	protected InputStream input = null;
	protected Properties prop = null;
	
	public ReadConfigFile() {
		try {
			ReadConfigFile.class.getClassLoader().getResourceAsStream(Constant.CONFIG_PROPERTIES_DIRECTORY);
				prop = new Properties();
				prop.load(input);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	public String getBrowser() {
		if (prop.getProperty("browserName")==null)
		
			return "";
			return prop.getProperty("browserName");
			
		}
	}


