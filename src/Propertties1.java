import java.util.*;
import java.io.*;
public class Propertties1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		String  s= p.getProperty("dinesh");
		System.out.println(s);
		p.setProperty("abi","99999");
		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos,"updated by dinesh");
		

	}

}
