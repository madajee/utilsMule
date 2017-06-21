package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertor {
	
	public void convertDate() {
		Date myDate = new Date();
		System.out.println(myDate);
		System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(myDate));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(myDate));
		System.out.println(myDate);
	}
	 public String printHello() {
         
		 System.out.println("Hello World");
         return "Hello World";
  }

}
