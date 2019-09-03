import java.util.Scanner;

public class TASK404351 {

    public static void main(String[] args) {
        int x, k;
        boolean check = false;
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;
        System.out.print("Các phần tử trong mảng: ");
        for (int a : arr) {
            System.out.print(a + "\t");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập giá trị cần xóa, x = ");
        x = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (x == arr[j]) {
                System.out.printf("%d có trong mảng!", x);
                for (k = j; k < arr.length - 1; k++) {
                    arr[k] = arr[k + 1];
                }
                arr[arr.length - 1] = 0;
                check = true;
            }
        }
        if (check == false) {
            System.out.printf("%d không có trong mảng!", x);
        }
        System.out.println("\nCác phần tử sau khi xóa: ");
        for (int a : arr)
            System.out.print(a + "\t");
    }
}
