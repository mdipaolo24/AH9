class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}

class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the link

            // Move to the next pair of nodes
            prev = current;
            current = next;
        }

        // Update the new head of the reversed list
        head = prev;

        return head;
    }

    public static void main(String[] args) {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;


        Node<String> head2 = reverseList(a); // f -> e -> d -> c -> b -> a


        x.next = y; // x -> y

        // Reverse the list and get the new head
        Node<String> head = reverseList(x); // y -> x

        // Printing the reversed list
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        while (head2 != null) {
            System.out.print(head2.val);
            head2 = head2.next;
        }
    }
}