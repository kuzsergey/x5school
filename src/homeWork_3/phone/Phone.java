package homeWork_3.phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public String getNumber() {

        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this("+78000000000", "smartphone", 100);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " c номера " + number);
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
