package dataStructures;

public class LinkedList {

    Node head;

    public void insert(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;      //allocating value of node to head
        } else {

            Node n = head;

            while (n.next != null) {
                n = n.next;
            }

            n.next = node;
        }
    }

    void show() {

        Node node = head;

        while (node.next != null) {
            System.out.println("Value is : " + node.data);
            node = node.next;
        }
        System.out.println("Value is : " + node.data);
    }

}
