import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (a==a.toUpperCase()){
            System.out.println("upper-case");
        }else System.out.println("lower-case");
    }
}
