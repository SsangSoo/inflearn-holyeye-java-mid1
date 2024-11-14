package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder result = adder.add(1).add(2).add(3);

        System.out.println("result = " + result);
    }
}
