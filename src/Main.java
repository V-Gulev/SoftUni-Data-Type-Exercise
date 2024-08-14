import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numbers ; i++) {
            double num1 = Double.parseDouble(scanner.next());
            double num2 = Double.parseDouble(scanner.next());
            int sum = 0;


            if (num1 > num2) {
                double biggerNum = Math.abs(num1);
                while (biggerNum > 0) {
                    sum += (int) (biggerNum % 10);
                    biggerNum /= 10;
                }
            }else {
                double biggerNum = Math.abs(num2);
                while (biggerNum > 0) {
                    sum += (int) (biggerNum % 10);
                    biggerNum /= 10;
                }
            }
            System.out.println(sum);
        }
    }
}
