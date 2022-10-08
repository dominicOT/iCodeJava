import java.time.LocalDate;
import java.time.Period;

public class ageCalculator {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(2004, 9, 26);
		int years = Period.between(birthDate, today).getYears();

		System.out.println(today);
		System.out.println(birthDate);
		System.out.println(years);
	}

}
