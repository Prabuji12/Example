import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTime obj = new DateTime();
		obj.testLocatTime();

	}
	
	public void testLocatTime() {
		LocalDateTime currentDetail = LocalDateTime.now();
		System.out.println(currentDetail);
		LocalDate presentDate = currentDetail.toLocalDate();
		System.out.println(presentDate);
		LocalTime currentTime = currentDetail.toLocalTime();
		System.out.println(currentTime);
		Month month = currentDetail.getMonth();
		int dayMonth = currentDetail.getDayOfMonth();
		int seconds = currentDetail.getSecond();
		int minute = currentDetail.getMinute();
		int year = currentDetail.getYear();
		int dayYear = currentDetail.getDayOfYear();
		int hour = currentDetail.getHour();
		int monthValue= currentDetail.getMonthValue();
		LocalDateTime date2 = currentDetail.withDayOfMonth(10).withYear(2012);
		System.out.println(date2);
		LocalDate date3 = LocalDate.of(2012, Month.DECEMBER, 12);
		System.out.println(date3);
		LocalTime date4 = LocalTime.of(17, 45);
		System.out.println(date4);
	}

}
