public class TASK404338 {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 3, 4, 5, 1, 2, 12};
        int index = minValue(arr);
        System.out.println("The Smallest element in the array is: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
