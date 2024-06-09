package linkedlist;

public class Node<T> {
    T body;
    Node<T> next;
    public Node(T body, Node<T> next){
        this.body = body;
        this.next = next;
    }
    public Node<T> next() {
        return next;
    }

    public T body(){
        return body;
    }

    @Override
    public String toString() {
        return "Node{" +
                "body=" + body +
                ", next=" + next +
                '}';
    }
}
