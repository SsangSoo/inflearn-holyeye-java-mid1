package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter(); // 아래의 클래스와 관계 없음.
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());  // nestedClass = class nested.nested.NestedOuter$Nested
    }
}