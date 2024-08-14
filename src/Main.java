import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int sum =0;
        while (n1!=0){
            sum += n1%10;
            n1/=10;
        }
        System.out.println(sum);
    }
}

