package homeWork_2.task_9;

public class Program9 {
    public static void main(String[] args) {
        int[] array1 = new int[]{15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[array1.length - 1 - i];
        }
        for (int i : array2) {
            System.out.print(i+" ");
        }
    }
}
