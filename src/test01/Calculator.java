package test01;

public class Calculator {

    public static void main(String[] args) {
        int res1 = add(10, 20);
        int res2 = sub(10, 20);

        System.out.println(res1);
        System.out.println(res2);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }
}
