package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate dt = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfMonth = dt.getDayOfWeek();
        DayOfWeek lastDayOfMonth = dt.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfMonth = " + firstDayOfMonth);
        System.out.println("lastDayOfMonth = " + lastDayOfMonth);

    }
}
