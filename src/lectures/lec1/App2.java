package lectures.lec1;

public class App2 {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }

    public static int divide(int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException("Divide by zero not permitted");
        }
        return a1 / a2;
    }
}
