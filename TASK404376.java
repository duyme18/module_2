import java.util.Scanner;

public class TASK404376 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();
        if (delta < 0) {
            System.out.println("The equation has no real roots");
        } else if (delta > 0) {
            System.out.print("The equation has two roots:" + root1 + " and " + root2);
        } else {
            System.out.println("The equation has one root -1");
        }
    }
}

class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double root1 = (-this.b + Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / (2 * this.a);
        return root1;
    }

    public double getRoot2() {
        double root2 = (-this.b - Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / (2 * this.a);
        return root2;
    }
}
