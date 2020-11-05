package homeWork_6.task_1.MyArrayCollection;

public class MyArrayCollection<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] data;
    private int size;

    public MyArrayCollection() {
        data = new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public void add(E item) {
        if (size == data.length) {
            Object[] result = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                result[i] = data[i];
            }
            data = result;
        }
        data[size] = item;
        size++;
    }

    public E get(int index) {
        if (index < this.size()) {
            return (E) data[index];
        } else {
            return null;
        }
    }

     public void remove(int index) {
        Object[] result = new Object[data.length];
        for (int i = 0, j = 0; i < size; j++) {
            if (j != index) {
                result[i] = data[j];
                i++;
            } else {
                continue;
            }
        }
        data = result;
        size--;
    }

    public void remove(E item) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(item)) {
                remove(i);
            }
        }
    }

    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public void show() {
        for (int i = 0; i < this.size(); i++) {
            System.out.print(this.get(i));
        }
        System.out.println();
        System.out.println(this.size());
        System.out.println();
    }
}
