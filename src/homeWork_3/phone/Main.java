package homeWork_3.phone;

public class Main {
    public static void main(String[] args) {
        Phone[] phones = {
                new Phone("+79684578694", "iphone", 135),
                new Phone("+78793547686", "samsung", 175),
                new Phone("+78793467586", "huawei", 180)
        };
        String[] names = {"Sergey", "Ivan", "Alexander"};

        for (Phone phone : phones) {
            System.out.println("Номер телефона: " + phone.getNumber() + ", модель: " + phone.getModel() + ", вес: " + phone.getWeight());
        }

        for (int i = 0; i < phones.length; i++) {
            phones[i].receiveCall(names[i]);
            System.out.println(phones[i].getNumber());
        }

        for (int i = 0; i < phones.length; i++) {
            phones[i].receiveCall(names[i], phones[i].getNumber());
        }

        phones[0].sendMessage("+79104569768", "+79605467575", "+74567568796");
        phones[1].sendMessage("+75769785768", "+75869769957");
        phones[2].sendMessage("+76575687546", "+77569394068", "+78578693476", "+78578679595");
    }
}
