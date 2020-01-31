package utils;

public class Constant {
	
	
public final static String CONSTANT_PROPERTIES_DIRECTORY = "";

public final static String GECKO_DRIVER_DIRECTORY = System.getProperty("user.dir", "/src/test/java/resources/chromedriver");

public final static String CHROME_DRIVER_DIRECTORY = System.setProperty("user.dir", "/src/test/java/resources/geckodriver");

public final static String IE_DRIVER_DIRECTORY = System.setProperty("user.dir", "/src/test/java/resources/iedriver");

}
