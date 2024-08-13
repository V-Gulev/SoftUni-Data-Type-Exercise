import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        double sum = 0.0;
        int iValue;
        for (int i = 1; i <= number; i++) {
            iValue=i;
            if (i >= 10) {
                while ( i != 0) {
                    int digit = i % 10;
                    sum += digit;
                    i /= 10;
                }
            } else sum += i;
            i= iValue;
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(i + " -> " + "True");
            } else System.out.println(i + " -> " + "False");
            sum=0;
        }

    }
}

