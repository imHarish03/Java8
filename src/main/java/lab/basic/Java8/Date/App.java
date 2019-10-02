package lab.basic.Java8.Date;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.toString()); // 2019-10-03T00:05:00.191
		System.out.println(localDateTime.getDayOfMonth()); // 3
		System.out.println(localDateTime.getHour()); // 0
		System.out.println(localDateTime.getNano()); // 911000000

		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime.toString()); // 2019-10-03T00:08:29.771+05:30

		offsetDateTime = OffsetDateTime.now(ZoneId.of("+05:30"));
		System.out.println(offsetDateTime.toString()); // 2019-10-03T00:08:29.771+05:30

		offsetDateTime = OffsetDateTime.now(ZoneId.of("-06:30"));
		System.out.println(offsetDateTime.toString()); // 2019-10-02T12:08:29.775-06:30

		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(zonedDateTime.toString());
	}
}
