import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class TesteCalendar {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-15T15:45:10Z"));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		
		int min = cal.get(Calendar.MINUTE);
		int month = cal.get(Calendar.MONTH);
		month = month + 1;
		
		System.out.println("min "+min);
		System.out.println("month "+month);
		System.out.println(sdf.format(d));

	}

}
