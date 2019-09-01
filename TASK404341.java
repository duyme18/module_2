import javafx.css.Size;

import java.util.Scanner;

public class TASK404341 {
    public static void main(String[] args) {
        int x, k;
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị cần chèn, x = ");
        x = sc.nextInt();

        System.out.print("Nhập vị trí cần chèn, k = ");
        k = sc.nextInt();
        if (k > 1 && k <= arr.length - 1) {
            for (int i = 0; i < arr.length; i++) {
                if (k == i) {
                    arr[i] = arr[i + 1];
                    arr[i] = x;
                }
            }
        }
        for (int a : arr)
            System.out.println("các phần tử sau khi chèn: " + a);
    }


}

