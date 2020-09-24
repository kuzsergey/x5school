package homeWork_6.task_1.MyArrayCollection;

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
        myArrayCollection.show();

        myArrayCollection.remove(1);
        myArrayCollection.remove(5);
        myArrayCollection.show();

        myArrayCollection.remove("H");
        myArrayCollection.remove("5");
        myArrayCollection.show();

        myArrayCollection.clear();
        myArrayCollection.show();

    }
}
