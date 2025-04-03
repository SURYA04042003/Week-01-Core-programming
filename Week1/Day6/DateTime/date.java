package buildinfunction;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class date {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a date (YYYY-MM-DD): ");
            String inputDate = scanner.nextLine();
            LocalDate date = LocalDate.parse(inputDate);
            LocalDate modifiedDate = date.plusDays(7)
                    .plusMonths(1)
                    .plusYears(2)
                    .minusWeeks(3);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            System.out.println("Modified Date: " + modifiedDate.format(formatter));

            scanner.close();
        }
    }

