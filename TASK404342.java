import java.awt.*;
import java.util.Scanner;

public class TASK404342 {
    static int m = 0, n = 0;
    static int[][] a;

    public static void main(String[] args) {
        nhap();
        findMax(a);
    }

    static void nhap() {
        Scanner scanner = new Scanner(System.in);
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

    static void findMax(int[][] arr) {
        int i1 = 0, j1 = 0;
        int max = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    i1 = i;
                    j1 = j;
                }

            }
        }
        System.out.printf("%d là phần tử lớn nhất trong ma trận, vị trí a[%d][%d].", max, i1, j1);
    }
}