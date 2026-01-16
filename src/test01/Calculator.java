package test01;

public class Calculator {

    public static void main(String[] args) {
        int res1 = add(100, 200);
        int res2 = sub(100, 200);
        int res3 = mul(100, 200);

        System.out.println("a + b = " + res1);
        System.out.println("a - b = " + res2);
        System.out.println("a * b = " + res3);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }
}
