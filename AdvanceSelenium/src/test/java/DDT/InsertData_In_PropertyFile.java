package DDT;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class InsertData_In_PropertyFile {
public static void main(String[] args) throws IOException {
	Properties p = new Properties();
	p.setProperty("url", " https://demowebshop.tricentis.com/");
	p.setProperty("username","Archana");
	p.setProperty("password","ravinderlakshmi");
	
	FileOutputStream fos = new FileOutputStream("./src/test/resources/prop.properties");
	p.store(fos, "prop1");
	System.out.println("Values is inserted");
}
}
