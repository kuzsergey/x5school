package homeWork_2.task_8;

public class Program8 {
    public static void main(String[] args) {
        int[] array = new int[]{1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = array[0];
        int sum1 = 0;
        int sum2 = 0;
        int n = 0;
        double sum3 = 0;
        int m = 0;
        double a = 0;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i > 0) {
                sum1 += i;
                n++;

            }
            if (i < 0 && (i % 2) == 0) {
                sum2 += i;
            }
            if (i < 0) {
                sum3 += i;
                m++;
            }
        }
        a = sum3 / m;
        System.out.println("Максимальное значение: " + max);
        System.out.println("Сумма положительных элементов: " + sum1);
        System.out.println("Сумма четных отрицательных элементов: " + sum2);
        System.out.println("Количество положительных элементов: " + n);
        System.out.println("Среднее арифметическое отрицательных элементов: " + a);
    }
}
