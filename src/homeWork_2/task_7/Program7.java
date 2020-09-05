package homeWork_2.task_7;

public class Program7 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Введите код города.");
            return;
        }
        int i = Integer.parseInt(args[0]);
        double price = 0;
        switch (i) {
            case 905:
                price = 4.15;
                break;
            case 194:
                price = 1.98;
                break;
            case 491:
                price = 2.69;
                break;
            case 800:
                price = 5.00;
                break;
            default:
                System.out.println("Введите верный код города");
        }
        System.out.println("Стоимость разговора: "+price*10);

    }
}
