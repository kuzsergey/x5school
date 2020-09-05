package homeWork_2.task_10;

public class Program10 {
    public static void main(String[] args) {
        int[] array1 = new int[]{15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] array2 = new int[array1.length];
        for (int i = 0, j = 0; i < array1.length; i++) {
            if (array1[i] != 0) {
                array2[j] = array1[i];
                j++;
            }
        }
        for (int i : array2) {
            System.out.print(i + " ");
        }
    }
}
