package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)을 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수를 읽는다. // 운영체제가 사용
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다. // 자바가 사용
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originalArray = {'h','e','l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length); // 깊은 복사

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Array.toString = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0); // 가급적 사용하지 않기 -> 프로그램이 의도치 않게 종료됨
        System.out.println("hello"); // 출력 X -> 프로그램이 추가되었기 때문
    }
}