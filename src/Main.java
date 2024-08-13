import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double times = Double.parseDouble(sc.nextLine());
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i <times ; i++) {
            BigDecimal n = sc.nextBigDecimal();
            sum=sum.add(n);
        }
        System.out.println(sum);
    }
}
