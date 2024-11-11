package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);


        int dog1Hex = System.identityHashCode(dog1);
        System.out.println("dog1Hex = " + dog1Hex);

        String refValue1 = Integer.toHexString(dog1Hex);
        System.out.println("refValue1 = " + refValue1);

        int dog2Hex = System.identityHashCode(dog2);
        System.out.println("dog2Hex = " + dog2Hex);

        String refValue2 = Integer.toHexString(dog2Hex);
        System.out.println("refValue2 = " + refValue2);

    }
}
