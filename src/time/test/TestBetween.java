package time.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);


        int remainYear = Period.between(startDate, endDate).getYears();
        int remainMonth = Period.between(startDate, endDate).getMonths();
        int remainDay = Period.between(startDate, endDate).getDays();

        System.out.println("남은 기간: " + remainYear + "년 " + remainMonth + "개월 " + remainDay + "일");

        long daysBtween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("디데이: " + daysBtween + "일 남음");

    }
}
