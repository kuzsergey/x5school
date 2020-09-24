package homeWork_2.task_9;

public class Program9 {
    public static void main(String[] args) {
        int[] inputArray = new int[]{15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[] resultArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            resultArray[i] = inputArray[inputArray.length - 1 - i];
        }
        for (int i : resultArray) {
            System.out.print(i + " ");
        }
    }
}
