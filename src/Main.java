import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String townName = sc.nextLine();
        BigDecimal population = new BigDecimal(sc.nextLine());
        BigDecimal area = new BigDecimal(sc.nextLine());
        System.out.printf("Town %s has population of %s and area %s square km.", townName, population, area);
    }
}
