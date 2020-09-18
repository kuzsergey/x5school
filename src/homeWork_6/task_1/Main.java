package homeWork_6.task_1;

public class Main {
    public static void main(String[] args) {
        MyArrayCollection<String> myArrayCollection = new MyArrayCollection<String>();
        myArrayCollection.Add("H");
        myArrayCollection.Add("e");
        myArrayCollection.Add("l");
        myArrayCollection.Add("l");
        myArrayCollection.Add("o");
        myArrayCollection.Add(" ");
        myArrayCollection.Add("X");
        myArrayCollection.Add("5");
        for (int i = 0; i < myArrayCollection.size(); i++) {
            System.out.print(myArrayCollection.get(i));
        }
        System.out.println();
        System.out.println(myArrayCollection.size());


        myArrayCollection.remove(2);
        myArrayCollection.remove(5);
        for (int i = 0; i < myArrayCollection.size(); i++) {
            System.out.print(myArrayCollection.get(i));
        }
        System.out.println();
        System.out.println(myArrayCollection.size());


        myArrayCollection.remove("H");
        myArrayCollection.remove("5");
        for (int i = 0; i < myArrayCollection.size(); i++) {
            System.out.print(myArrayCollection.get(i));
        }
        System.out.println();
        System.out.println(myArrayCollection.size());

        myArrayCollection.clear();
        for (int i = 0; i < myArrayCollection.size(); i++) {
            System.out.print(myArrayCollection.get(i));
        }
        System.out.println();
        System.out.println(myArrayCollection.size());

    }
}
