import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {
	public static void main(String[] args) {

		LocalDate local = LocalDate.now();
		System.out.println(local);
		LocalTime local1 = LocalTime.now();
		System.out.println(local1);
		LocalDateTime L1 = LocalDateTime.now();
		System.out.println(L1);

		// current day,month and year
		int day = local.getDayOfMonth();
		System.out.println(day);
		int month = local.getMonthValue();
		System.out.println(month);
		int year = local.getYear();
		System.out.println(year);

		// todays date by arbitary method
		LocalDate L = LocalDate.of(2020, 02, 29);
		System.out.println(L);

		// to check
		LocalDate lc = LocalDate.of(2020, 02, 29);
		LocalDate lc1 = LocalDate.now();
		if (lc.equals(lc)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
