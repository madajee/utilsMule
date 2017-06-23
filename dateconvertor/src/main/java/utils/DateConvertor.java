package utils;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateConvertor {
	
	//public void convertDate(String convertDate, String fromFormat, String toFormat) throws Exception{
		public String convertDate(String convertDate, String fromFormat , String toFormat) throws Exception{
		System.out.println("InputParams: "+ convertDate + " "+ fromFormat + " "+ toFormat);
		DateFormat format = new SimpleDateFormat(fromFormat, Locale.ENGLISH);
		//Date myDate = new Date();
		//Date fromDate = format.parse("02/19/2017");
		Date fromDate = format.parse(convertDate);
		System.out.println("FromDate: " + fromDate.toString());
		((SimpleDateFormat) format).applyPattern(toFormat);
		String toDate = format.format(fromDate);
		//String toDate = new SimpleDateFormat(toFormat).format(fromDate);
		System.out.println("ToDate: " + toDate);
		System.out.println("InputParams: "+ convertDate + " "+ fromFormat + " "+ toFormat);
		return toDate;
		
	}
	 public String printHello() {
         
		 System.out.println("Hello World");
         return "Hello World";
  }

}
