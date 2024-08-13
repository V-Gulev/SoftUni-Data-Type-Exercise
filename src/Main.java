import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkStop = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int valueOfI ;
        boolean ifSpecial;
        for (int i = 1; i <= checkStop; i++) {
            valueOfI = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            ifSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (!ifSpecial){
                System.out.printf("%d -> False%n", valueOfI);
            }else System.out.printf("%d -> True%n", valueOfI);
            sum = 0;
            i = valueOfI;
        }

    }
}

