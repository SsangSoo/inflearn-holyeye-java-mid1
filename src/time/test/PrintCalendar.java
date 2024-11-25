package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();

        System.out.println("Su Mo Tu We Th Fr Sa");

        int[][] calendar = new int[5][7];

        LocalDate startDate = LocalDate.of(year, month, 1);
        int start = 1;

        LocalDate endDate = startDate.with(TemporalAdjusters.lastDayOfMonth());
        int endDateDay = endDate.getDayOfMonth();

        int startDay = startDate.getDayOfWeek().getValue();

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 7; j++) {
                if(j == 1 && startDay == 7) {
                    System.out.printf("%02d", start++);
                } else if(j >= 2 && j < 7) {
                    System.out.printf("%02d", start++);
                } else {
                    System.out.println(" ");
                }
                System.out.print(" ");
            }
            System.out.println();

        }


    }
}
