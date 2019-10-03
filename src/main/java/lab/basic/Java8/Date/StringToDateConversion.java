package lab.basic.Java8.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToDateConversion {
	public static void main(String[] args) {
		String armisticeDate = "2019-10-03";

		LocalDate aLD = LocalDate.parse(armisticeDate);
		System.out.println("Date: " + aLD);

		String armisticeDateTime = "2019-10-03T23:50";
		LocalDateTime aLDT = LocalDateTime.parse(armisticeDateTime);
		System.out.println("Date/Time: " + aLDT);

		String anotherDate = "03 Oct 2019";

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");
		LocalDate random = LocalDate.parse(anotherDate, df);

		System.out.println(anotherDate + " parses as " + random);
	}
}
