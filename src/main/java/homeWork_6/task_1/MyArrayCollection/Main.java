package homeWork_6.task_1.MyArrayCollection;

public class Main {
    public static void main(String[] args) {
        MyArrayCollection<String> myArrayCollection = new MyArrayCollection<String>();
        myArrayCollection.add("H");
        myArrayCollection.add("e");
        myArrayCollection.add("l");
        myArrayCollection.add("l");
        myArrayCollection.add("o");
        myArrayCollection.add(" ");
        myArrayCollection.add("X");
        myArrayCollection.add("5");
        myArrayCollection.show();

        myArrayCollection.remove(1);
        myArrayCollection.show();
        myArrayCollection.remove(5);
        myArrayCollection.show();

        myArrayCollection.remove("H");
        myArrayCollection.remove("5");
        myArrayCollection.show();

        myArrayCollection.clear();
        myArrayCollection.show();
    }

}
