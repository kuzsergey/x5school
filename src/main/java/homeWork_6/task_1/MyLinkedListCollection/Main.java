package homeWork_6.task_1.MyLinkedListCollection;

public class Main {
    public static void main(String[] args) {
        MyLinkedListCollection<String> myLinkedListCollection = new MyLinkedListCollection<>();
        myLinkedListCollection.add("H");
        myLinkedListCollection.add("e");
        myLinkedListCollection.add("l");
        myLinkedListCollection.add("l");
        myLinkedListCollection.add("o");
        myLinkedListCollection.add(" ");
        myLinkedListCollection.add("X");
        myLinkedListCollection.add("5");
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
