import java.util.Scanner;

public class TASK404343 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a = ");
        a = scanner.nextInt();
        System.out.print("Nhập cạnh b = ");
        b = scanner.nextInt();
        System.out.print("Nhập cạnh c = ");
        c = scanner.nextInt();
        check(a, b, c);
    }

    public static void check(int x, int y, int z) {
        try {
            if (x < 0 || y < 0 || z < 0) {
                throw new IlligalTriangleException();
            } else {
                if (x + y <= z || x + z <= y || y + z <= x) {
                    throw new IlligalTriangleException();
                } else {
                    System.out.println("Đây là tam giác");
                }
            }
        } catch (IlligalTriangleException e) {
            System.err.println("Hãy thử lại.");
        }
    }

}

class IlligalTriangleException extends Exception {
    public IlligalTriangleException() {

    }
}
