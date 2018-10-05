import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class HowOldAreYou {

	public static void main(String[] args) {

		System.out.print("Give me your date of birth in format like YYYY-MM-DD: ");

		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();
				
				if (input.matches("\\d{4}-\\d{2}-\\d{2}")) {
					LocalDate parsedInput = LocalDate.parse(input);
					LocalDate now = LocalDate.now();

					long days = ChronoUnit.DAYS.between(parsedInput, now);
					long age = ChronoUnit.YEARS.between(parsedInput, now);

					System.out.println("Your Age now is: " + age +" years old"+ "\n" + "You live: "
							+ days + " days");

				}

				else {
					System.out.println("Incorrect format of date, right format is: YYYY-MM-DD");
				}
				
			

			} catch (Exception e) {

				e.printStackTrace();
			}

		}
	}

//	public static int getAge(LocalDate input) {
//		LocalDate now = LocalDate.now();
//		return Period.between(input, now).getYears();
//
//	}

}