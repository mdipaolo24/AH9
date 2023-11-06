//class Node<T> {
//  T val;
//  Node<T> next;
//
//  public Node(T val) {
//    this.val = val;
//    this.next = null;
//  }
//}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    // If the list is empty, return true as there are no elements to compare.
    if (head == null) {
      return true;
    }

    // Get the value of the first node to compare with the rest of the list.
    T valueToCompare = head.val;

    // Recursive check for the rest of the list.
    return isUnivalueListRecursive(head.next, valueToCompare);
  }

  private static <T> boolean isUnivalueListRecursive(Node<T> current, T valueToCompare) {
    // Base case: if we reach the end of the list, return true.
    if (current == null) {
      return true;
    }

    // Check if the current node's value is equal to the value we want to compare.
    if (!current.val.equals(valueToCompare)) {
      return false;
    }

    // Continue checking the rest of the list recursively.
    return isUnivalueListRecursive(current.next, valueToCompare);
  }

  public static void main(String[] args) {
    Node<Integer> u = new Node<>(2);
    Node<Integer> v = new Node<>(2);
    Node<Integer> w = new Node<>(2);
    Node<Integer> x = new Node<>(2);
    Node<Integer> y = new Node<>(2);

    u.next = v;
    v.next = w;
    w.next = x;
    x.next = y;

    // Print the result for the linked list u
    System.out.println(ECSource.isUnivalueList(u)); // Should print "true"

    Node<Integer> u2 = new Node<>(2);
    Node<Integer> v2 = new Node<>(2);
    Node<Integer> w2 = new Node<>(3);
    Node<Integer> x2 = new Node<>(3);
    Node<Integer> y2 = new Node<>(2);

    u2.next = v2;
    v2.next = w2;
    w2.next = x2;
    x2.next = y2;

    // Print the result for the linked list u2
    System.out.println(ECSource.isUnivalueList(u2)); // Should print "false"

    Node<String> z = new Node<>("z");

    // Print the result for the linked list z
    System.out.println(ECSource.isUnivalueList(z)); // Should print "true"
  }
}