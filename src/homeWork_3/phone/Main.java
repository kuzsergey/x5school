package homeWork_3.phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+79684578694", "iphone", 135);
        Phone phone2 = new Phone("+78793547686", "samsung", 175);
        Phone phone3 = new Phone("+78793467586", "huawei", 180);

        System.out.println("Номер телефона: " + phone1.number + ", модель: " + phone1.model + ", вес: " + phone1.weight);
        System.out.println("Номер телефона: " + phone2.number + ", модель: " + phone2.model + ", вес: " + phone2.weight);
        System.out.println("Номер телефона: " + phone3.number + ", модель: " + phone3.model + ", вес: " + phone3.weight);

        phone1.receiveCall("Sergey");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Ivan");
        System.out.println(phone2.getNumber());
        phone3.receiveCall("Alexander");
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Sergey", "+78678796574");
        phone2.receiveCall("Ivan", "+78796784586");
        phone3.receiveCall("Alexander", "+78795687576");

        phone1.sendMessage("+79104569768", "+79605467575", "+74567568796");
        phone2.sendMessage("+75769785768", "+75869769957");
        phone3.sendMessage("+76575687546", "+77569394068", "+78578693476", "+78578679595");
    }
}
