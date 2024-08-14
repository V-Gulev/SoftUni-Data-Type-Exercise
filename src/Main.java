import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokedCounter = 0;
        int originalValueOfPower = power;
        while (power >= distance) {
            power -= distance;
            pokedCounter++;
            if (power == (double) originalValueOfPower / 2 && exhaustionFactor != 0) {
                power/=  exhaustionFactor;
            }
        }
        System.out.println(power);
        System.out.println(pokedCounter);
    }
}
