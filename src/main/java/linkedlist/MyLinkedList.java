package linkedlist;

public class MyLinkedList<T> {
    Node<T> head;
    public MyLinkedList() {
        this.head = null;
    }

    public void add(T body) {
        if (head == null) {
            head = new Node<>(body, null);
        } else {
            Node<T> current = head;
            while (current.next() != null) {
                current = current.next();
            }
            current.next = new Node<>(body, null);
        }
        System.out.println(head);
    }



    public boolean delete(T body) {
        if (head == null) {
            return false;
        }

        if (head.body().equals(body)) {
            head = head.next();
            return true;
        }

        Node<T> current = head;
        Node<T> previous = null;

        while (current != null) {
            if (current.body().equals(body)) {
                if (previous != null) {
                    previous = new Node<>(previous.body(), current.next());
                }
                return true;
            }
            previous = current;
            current = current.next();
        }
        return false;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.body());
            current = current.next();
        }
    }

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("strawberry");

        System.out.println("Before removal:");
        list.printList(); // Output: apple, banana, apple

        list.delete("apple"); // Видаляє перший вузол з даними "apple"

        System.out.println("After removal:");
        list.printList(); // Output: banana, apple
    }

}
