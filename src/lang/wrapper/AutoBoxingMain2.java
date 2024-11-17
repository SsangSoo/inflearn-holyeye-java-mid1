package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱(Auto-boxing)
//        Integer boxedValue = Integer.valueOf(value); // 컴파일 단계에서 추가

        // Wrapper -> Primitive
        int unboxedValue = boxedValue;  // 오토 언박싱(Auto-unboxing)
//        int unboxedValue = boxedValue.intValue(); // 컴파일 단계에서 추가

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
