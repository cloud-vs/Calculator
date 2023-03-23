
import java.util.Scanner;

public class Main {
    private static int resultNum;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int firstNum = scanner.nextInt();
            String operation = scanner.next();
            int secondNum = scanner.nextInt();

            switch (operation){
                case "-" -> resultNum = firstNum - secondNum;
                case "+" -> resultNum = firstNum + secondNum;
                case "*" -> resultNum = firstNum * secondNum;
                case "/" -> resultNum = firstNum / secondNum;
            }
        System.out.println("Result:" + " " + resultNum);
    }
}