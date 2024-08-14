import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int letters = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < letters; i++) {
            char letter = scanner.next().charAt(0);
            sum += letter;
        }
        System.out.println("The sum equals: "+sum);
    }
}

