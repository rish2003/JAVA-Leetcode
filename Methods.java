public class Methods {

    // 1. Simple methods
    public static int sum(int a, int b) {
        return a + b;   
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    // 2. LinkedList creation and traversal
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // method to print linked list
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // 3. Recursive method: Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) return n;  
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        
        int a = 10, b = 5;
        System.out.println("Sum: " + sum(a, b));
        System.out.println("Subtraction: " + subtract(a, b));

        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Linked List: ");
        printLinkedList(head);

       
        int n = 6;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}


//Static Keyword is used when the when the method or variable
//belongs to the class itself rather than to instances of the class
//Static methods can be called without creating an object of the class
// 1️⃣ What static means

// When you declare a variable or method as static, it belongs to the class itself, not to individual objects (instances) of that class.

// Normal (non-static) members: Each object has its own copy.

// Static members: Shared across all objects of the class.

// 2️⃣ Where you usually see static

// static methods: You can call them without creating an object.

// static variables: Only one copy exists for all objects.

// static blocks: Used for initialization when the class loads.
