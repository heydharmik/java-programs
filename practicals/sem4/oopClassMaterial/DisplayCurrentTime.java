package practicals.sem4.oopClassMaterial;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayCurrentTime {
	public static void main(String[] args) {
		System.out.println(java.time.LocalTime.now());
		
		//2nd way
		long millis = System.currentTimeMillis();
		Date date = new Date(millis);
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
		String strDate = formatter.format(date);
		System.out.println(strDate);
	}
}
