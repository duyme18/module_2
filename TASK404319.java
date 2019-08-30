import java.util.Scanner;

public class TASK404319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int i, j;
        int check = 1;
        for (i = 2; i <= number; i++) {
            for (j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    check = 0;
                }
            }
            if (check == 1) {
                System.out.printf("%d\t", i);
            }
            check = 1;
        }
    }
}
