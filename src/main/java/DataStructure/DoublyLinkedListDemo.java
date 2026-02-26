package DataStructure;


//Node class for the doubly linked list
class Node2 {
 int data;
 Node2 next;
 Node2 prev;

 public Node2(int data) {
     this.data = data;
     this.next = null;
     this.prev = null;
 }
}

//Doubly Linked List class
class DoublyLinkedList {
 Node2 head;
 Node2 tail;

 // Constructor to initialize the doubly linked list
 public DoublyLinkedList() {
     this.head = null;
     this.tail = null;
 }

 // Add a node at the end of the list
 public void append(int data) {
     Node2 newNode = new Node2(data);
     
     // If the list is empty, make the new node both head and tail
     if (head == null) {
         head = newNode;
         tail = newNode;
         return;
     }
     
     // Otherwise, add the new node at the end
     tail.next = newNode;
     newNode.prev = tail;
     tail = newNode;
 }

 // Add a node at the beginning of the list
 public void prepend(int data) {
     Node2 newNode = new Node2(data);
     
     // If the list is empty, make the new node both head and tail
     if (head == null) {
         head = newNode;
         tail = newNode;
         return;
     }
     
     // Otherwise, add the new node at the beginning
     newNode.next = head;
     head.prev = newNode;
     head = newNode;
 }

 // Delete a node with a specific value
 public void delete(int data) {
     if (head == null) return; // If the list is empty, nothing to delete
     
     Node2 current = head;
     
     // Traverse the list to find the node to delete
     while (current != null && current.data != data) {
         current = current.next;
     }
     
     // If the node is not found
     if (current == null) return;
     
     // If the node to be deleted is the head node
     if (current == head) {
         head = current.next;
         if (head != null) head.prev = null;
     }
     // If the node to be deleted is the tail node
     else if (current == tail) {
         tail = current.prev;
         if (tail != null) tail.next = null;
     }
     // If the node is in the middle
     else {
         current.prev.next = current.next;
         if (current.next != null) current.next.prev = current.prev;
     }
 }

 // Print the list from head to tail
 public void printForward() {
     Node2 current = head;
     while (current != null) {
         System.out.print(current.data + " <-> ");
         current = current.next;
     }
     System.out.println("null");
 }

 // Print the list from tail to head
 public void printBackward() {
     Node2 current = tail;
     while (current != null) {
         System.out.print(current.data + " <-> ");
         current = current.prev;
     }
     System.out.println("null");
 }
}

//Main class to test the Doubly Linked List
public class DoublyLinkedListDemo {
 public static void main(String[] args) {
     DoublyLinkedList list = new DoublyLinkedList();

     // Append elements
     list.append(10);
     list.append(20);
     list.append(30);
     
     // Prepend an element
     list.prepend(5);

     System.out.println("List in forward direction:");
     list.printForward();  // Expected: 5 <-> 10 <-> 20 <-> 30 <-> null

     System.out.println("List in backward direction:");
     list.printBackward(); // Expected: 30 <-> 20 <-> 10 <-> 5 <-> null

     // Delete an element
     list.delete(20);
     
     System.out.println("List after deleting 20:");
     list.printForward();  // Expected: 5 <-> 10 <-> 30 <-> null
 }
}

