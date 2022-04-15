package StreamApi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class DateandTimeEx 
{

	public static void main(String[] args) 
	{
		//Instant
		Instant i=Instant.now();
		System.out.println(i);
		//Duration
		Instant i2=Instant.now();
		Duration duration=Duration.between(i, i2);
		System.out.println(duration);
		
		//LocalDate
		LocalDate currentDate=LocalDate.now();
		System.out.println(currentDate);
		//Period
		LocalDate birthDate=LocalDate.of(2001,06,15);
		Period p=Period.between(birthDate, currentDate);
		System.out.println(p.getYears());
		
		//LocalTime
		LocalTime t=LocalTime.now();
		System.out.println(t);
		
		//LocalDateTime
		LocalDateTime dt=LocalDateTime.now();
		LocalDateTime dt2=LocalDateTime.of(2001, Month.JUNE,15,16,12,15);
		System.out.println(dt);
		System.out.println(dt2);
		
		//Formatting yyyy-mm-dd and hh:mm:ss
		LocalDateTime dateTime=LocalDateTime.now();
		int days=dateTime.getDayOfMonth();
		int month=dateTime.getMonthValue();
		int year=dateTime.getYear();
		System.out.printf("%d - %d - %d ",year,month,days);
		System.out.println();
		
		//DateTimeFormatter
		DateTimeFormatter aFormatter=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm");
		LocalDateTime ldt=LocalDateTime.of(2021, Month.SEPTEMBER,23,12,12);
		String formattedString=ldt.format(aFormatter);
		System.out.println(formattedString);
		
		//year
		Year y=Year.now();
		System.out.println(y);
		
		//ZoneId
		ZoneId z=ZoneId.systemDefault();
		System.out.println(z);
		
		//ZoneDateTime
		ZoneId zUS=ZoneId.of("America/Chicago");
		ZonedDateTime zdt=ZonedDateTime.now(zUS);
		System.out.println(zdt);

	}

}
