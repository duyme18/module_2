import java.util.Scanner;

public class TASK404322 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        usd = scanner.nextDouble();
        double result = usd * vnd;
        System.out.print(usd + " USD = " + result + " VND");
    }
}
