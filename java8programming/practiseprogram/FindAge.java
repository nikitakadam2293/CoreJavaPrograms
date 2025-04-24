package java8programming.practiseprogram;

// 32) Find the age of a person in years if the birthday has given?

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindAge {
    public static void main(String[] args) {

        LocalDate birthDayDate = LocalDate.of(2002,04,17);
        LocalDate today = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(birthDayDate,today));
    }
}
