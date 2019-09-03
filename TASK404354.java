import java.util.Scanner;

public class TASK404354 {
    static Scanner scanner = new Scanner(System.in);
    static int m = 0, n = 0;
    static int[][] a;

    public static void main(String[] args) {
        Nhap();
        Sum(a);
    }

    static void Sum(int[][] a) {
        int sum = 0;
        System.out.print("Nhập só cột muốn tính tổng ở vị trí k = ");
        int k = scanner.nextInt();
        if (k >= 0 && k < a.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (k == j) {
                        sum += a[i][j];
                    }
                }
            }
            System.out.printf("Tổng cột vị trí %d = ", k);
            System.out.print(sum);
        } else {
            System.out.print("Vị trí cột không hợp lệ.");
        }


    }

    static void Nhap() {
        System.out.println("Nhập vào số dòng và số cột của ma trận.");
        System.out.print("Nhập vào số hàng, m = ");
        m = scanner.nextInt();
        System.out.print("Nhập vào số cột, n = ");
        n = scanner.nextInt();
        a = new int[m][n];
        System.out.print("Nhập giá trị cho từng phần tử của mảng.\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "]= ");
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.print("\nMảng 2 chiều vừa nhập là:\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
