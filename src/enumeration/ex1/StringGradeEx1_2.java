package enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 상수를 가져온다고 해도, 문자열을 넣어버릴 수 있기 때문에 근본적으로 해결하진 못한다.
        // 상수를 가져오도록 DiscountService 클래스에서 주석처리를 했더라도 타입을 강제하지 못한 DiscountService 개발자의 책임이 있다. -> 열거형으로 해결가능하다.

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액 :" + vip);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액 : " + diamondd);

        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액 : " + gold);
    }
}
