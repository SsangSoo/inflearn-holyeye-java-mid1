package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("value.name = " + value.name()); // ENUM 그대로 이름 반환 //BASIC, GOLD, DIAMOND

            // 순서 -> 가급적 사용하지 않는 것이 좋다. :
            // 중간에 상수를 선언하는 위치가 변경되면 전체 상수의 위치가 모두 변경된다.
                // ordinal의 값이 데이터베이스나 파일에 저장되어있으면.. 어질어질하다.
            System.out.println("value.ordinal = " + value.ordinal());
        }

        // String -> ENUM 변환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);   // toString() 오버라이딩 가능

        // String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
//        String wrongInput = "GOLDD";
//        Grade wrongGold = Grade.valueOf(wrongInput);
//        System.out.println("wrongGold = " + wrongGold);

    }
}