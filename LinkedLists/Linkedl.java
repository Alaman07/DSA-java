public class Linkedl {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Linkedl() {
        this.size = 0;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size += 1;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size += 1;
    }

    public void insertAtIndex(int data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }
        if (index == size) {
            insertAtEnd(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public boolean search(int key) {
        Node current = head;
        while (current.next != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void delete(int target) {
        if (head == null)
            return;

        if (head.data == target) {
            head = head.next;
            if (head == null)
                tail = null;
            size -= 1;
            return;
        }
        Node current = head;
        Node prev = null;
        while (current != null && current.data != target) {
            prev = current;
            current = current.next;
        }
        if (current == null)
            return;
        prev.next = current.next;
        if (current == tail)
            tail = prev;
        size -= 1;
    }

    public void deleteFirst() {
        if (head == null)
            return;
        head = head.next;
        if (head == null)
            tail = null;
        size--;
    }

    public void deleteLast() {
        if (head == null)
            return;
        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
        size--;
    }

    public int size() {
        return size;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Linkedl ll = new Linkedl();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(40);
        ll.insertAtBeginning(5);
        ll.display();
        System.out.println(ll.search(10));
        ll.delete(20);
        ll.display();
        System.out.println(ll.size());
        ll.insertAtIndex(30, 2);
        ll.display();
    }
}
