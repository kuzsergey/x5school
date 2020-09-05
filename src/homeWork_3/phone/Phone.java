package homeWork_3.phone;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " c номера " + number);
    }

    String getNumber() {
        return this.number;
    }
    void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
