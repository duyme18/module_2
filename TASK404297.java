import java.util.Scanner;

public class TASK404297 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
            if (a == 0) {
                double anser = (c - b) / a;
                System.out.printf("Equation pass with = %f!\n", anser);
            } else {
                if (b == 0) {
                    System.out.print("The solution is all x!");
                } else {
                    System.out.print("No solution!");
                }
            }
        }
    }
}
