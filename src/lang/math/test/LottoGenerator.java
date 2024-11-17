package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
//        lottoNumbers = new int[6];
//        count = 0;
//
//        int[] numArr = new int[45];
//        for(int i = 0 ; i < 45; i++) {
//            numArr[i] = i + 1;
//        }
//
//        while(count < 6) {
//            int randomNumber = random.nextInt(45);
//            int temp = numArr[randomNumber];
//            numArr[randomNumber] = numArr[count];
//            numArr[count] = temp;
//            count++;
//        }
//
//
//        for(int i=0; i<count; i++) {
//            lottoNumbers[i] = numArr[i];
//        }
//
//        return lottoNumbers;

        // 영한님 방법
        lottoNumbers = new int[6];
        count = 0;

        while(count < 6) {
            // 1부터 45사이의 숫자 생성
            int number = random.nextInt(45) + 1;
            // 중복되지 않은 경우에만 배열에 추가
            if(isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        for(int i=0; i < count; i++) {
            if(lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }


    public void printLotto() {
        StringBuilder sb = new StringBuilder();
        sb.append("로또 번호: ");

        for(int i=0; i<lottoNumbers.length; i++) {
            sb.append(lottoNumbers[i] + " ");
        }
        System.out.println(sb);
    }
}
