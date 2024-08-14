import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starting = Integer.parseInt(scanner.nextLine());

        int total = 0;
        int days = 0;

        while (starting >= 100) {
            total += starting;
            starting -= 10;
            days++;
            total -= 26;
        }

        if (total >= 26) {
            total -= 26;
        }

        System.out.println(days);
        System.out.println(total);


    }
}

