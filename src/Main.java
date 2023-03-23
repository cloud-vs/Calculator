
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number");
        int a = scanner.nextInt();
        System.out.println(a + " "+"first number");
        System.out.println("second number");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("Result:" + " " + c);
    }
}