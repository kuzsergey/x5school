package homeWork_2.task_10;

public class Program10 {
    public static void main(String[] args) {
        int[] inputArray = new int[]{15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] resultArray = new int[inputArray.length];
        for (int i = 0, j = 0; i < inputArray.length; i++) {
            if (inputArray[i] != 0) {
                resultArray[j] = inputArray[i];
                j++;
            }
        }
        for (int i : resultArray) {
            System.out.print(i + " ");
        }
    }
}
