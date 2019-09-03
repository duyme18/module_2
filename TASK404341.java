import java.util.Scanner;

public class TASK404341 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, viTri;
        int[] arr;
        arr = new int[10];
        int length = arr.length - 1;
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;
        System.out.print("Các phần tử trong mảng: ");
        for (int a : arr) {
            System.out.print(a + "\t");
        }
        System.out.print("\nNhập giá trị cần chèn, x = ");
        x = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn, vị trí = ");
        viTri = scanner.nextInt();
        ThemPhanTu(arr, length, x, viTri);
        System.out.print("Các phần tử sau khi thêm: ");
        for (int c : arr) {
            System.out.print(c + "\t");
        }

    }

    static void ThemPhanTu(int a[], int n, int x, int viTri) {
        if (viTri >= 0 && viTri <= n) {
            for (int i = n; i > viTri; i--) {
                a[i] = a[i - 1];
            }
            a[viTri] = x;
            n++;
        } else
            System.out.printf("\nVị trí không hợp lệ.", viTri);
    }
}