package homeWork_6.task_1.MyLinkedListCollection;

public class MyLinkedListCollection<E> {

    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public int size() {
        return size;
    }

    public void add(E item) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(l, item, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    public void remove(int index) {
        unlike(node(index));
    }

    public void remove(E item) {
        if (item == null) {
            for (Node<E> node = first; node != null; node = node.next) {
                if (node.item == null) {
                    unlike(node);
                }
            }
        } else {
            for (Node<E> node = first; node != null; node = node.next) {
                if (item.equals(node.item)) {
                    unlike(node);
                }
            }
        }

    }

    private void unlike(Node<E> node) {
        E element = node.item;
        Node<E> next = node.next;
        Node<E> prev = node.prev;
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            node.prev = null;
        }
        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            node.next = null;
        }
        node.item = null;
        size--;

    }

    public E get(int index) {
        return node(index).item;
    }


    private Node<E> node(int index) {
        Node<E> node;
        if (index < (size >> 1)) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    public void clear() {
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = null;
        last = null;
        size = 0;

    }

    public void show() {
        for (int i = 0; i < this.size(); i++) {
            System.out.print(this.get(i) + " ");
        }
        System.out.println();
        System.out.println("Size: " + this.size());
        System.out.println("");
    }

    public static class Node<E> {
        private E item;
        private Node<E> next;
        private Node<E> prev;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
