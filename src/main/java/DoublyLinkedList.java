class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        Node three = new Node(3);
        dll.head = three;
        dll.push(2);
        dll.push(1);
        dll.printReverseList();
        dll.append(4);
        dll.printList();
        dll.insertBefore(new Node(4), 5);
        dll.printList();
    }
    
    Node head;
    static class Node {
        int data;
        Node prev;
        Node next;
        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    public void printList() {
        Node n = head;
        while(n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public void printReverseList() {
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        while (last != null) {
            System.out.println(last.data);
            last = last.prev;
        }
    }

    public void push(int data) {
        Node n = new Node(data);
        n.next = head;
        n.prev = null;
        if (head != null) {
            head.prev = n;
        }
        head = n;
    }

    public void append(int data) {
        Node n = new Node(data);
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = n;
        n.prev = last;
    }

    public void insertBefore(Node n, int data) {
        Node node = new Node(data);
        Node found = head;
        while (found.data != n.data) {
            found = found.next;
        }
        if (found != null) {
            Node prev = found.prev;
            found.prev = node;
            node.next = found;
            prev.next = node;
            node.prev = prev;
        }
    }
}