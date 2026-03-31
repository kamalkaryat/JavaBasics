package core.date_time.old_api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.regex.PatternSyntaxException;

public class DtConcept {

	public static void main(String[] args) throws ParseException {
//		String testDate = "29-Apr-2010,13:00:14 PM";
//		DateFormat formatter = new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa");
//		Date date = formatter.parse(testDate);
//		System.out.println(date);
		
//		String sDate="2020-04-07";
//		DateFormat format=new SimpleDateFormat("yyyy-mm-dd");
//		Date date= format.parse(sDate);
//		
//		System.out.println(date);
//		System.out.println(ZoneId.systemDefault());
//		LocalDate localDt= date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//		System.out.println(localDt);
		//Getting the current date
		
//		String sDate="2020-04-07";
//		DateFormat format=new SimpleDateFormat("yyyy-mm-dd");
//		Date date= format.parse(sDate);
////		Date date = new Date();
//		System.out.println("Date is: "+date);
//			
//		//Getting the default zone id
//		ZoneId defaultZoneId = ZoneId.systemDefault();
//			
//		//Converting the date to Instant
//		Instant instant = date.toInstant();
//		System.out.println(instant);
//		
//		//Converting the Date to LocalDate
//		LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();
//		System.out.println("Date is: "+localDate.getDayOfMonth()+"-"+localDate.getMonthValue()+"-"+localDate.getYear());
//		System.out.println("Local Date is: "+localDate);
//		
		Date date= new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String strDt=formatter.format(date);
		System.out.println(strDt);
		System.out.println(formatter.format(date));
	}

}
