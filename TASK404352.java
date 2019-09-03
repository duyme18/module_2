import java.util.Scanner;

public class TASK404352 {
    public static void main(String[] args) {
        String str;
        char kyTu = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu + " trong chuỗi " + str + " = " + count);
    }
}
