package homeWork_6.task_1.MyLinkedListCollection;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedListCollection<String> myLinkedListCollection = new MyLinkedListCollection<>();
        myLinkedListCollection.Add("H");
        myLinkedListCollection.Add("e");
        myLinkedListCollection.Add("l");
        myLinkedListCollection.Add("l");
        myLinkedListCollection.Add("o");
        myLinkedListCollection.Add(" ");
        myLinkedListCollection.Add("X");
        myLinkedListCollection.Add("5");
        myLinkedListCollection.show();

        myLinkedListCollection.remove("e");
        myLinkedListCollection.remove("X");
        myLinkedListCollection.show();

        myLinkedListCollection.remove(1);
        myLinkedListCollection.remove(myLinkedListCollection.size() - 1);
        myLinkedListCollection.show();

        myLinkedListCollection.clear();
        myLinkedListCollection.show();

    }
}
