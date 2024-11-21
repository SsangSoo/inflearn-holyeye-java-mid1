package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        // 계산(불변)
        ofDate = ofDate.plusDays(10);    // 특정 일을 더한다. // 불변이다. -> 반드시 반환값을 꼭 받아야 한다.
        System.out.println("지정 날짜 + 10d = " + ofDate);
    }
}
