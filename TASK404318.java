public class TASK404318 {
    public static void main(String[] args) {
        int i, j;
        int check = 1;
        for (i = 2; i <= 100; i++) {
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
