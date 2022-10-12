package implementations;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(29);
        linkedList.add(65);
        linkedList.add(157);

        linkedList.addAtStart(25);

        linkedList.addAt(0, 55);
        
        linkedList.printData();
        linkedList.deleteAt(3);
        linkedList.printData();
    }

    Node head;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        node.nextNode = null;
        if (head == null) { // if there are no nodes then makes this node as head node
            head = node;
        } else {
            Node n = head;
            while (n.nextNode != null) { // iterate over whole list untill next node
                n = n.nextNode; // doesn't become null

            }
            n.nextNode = node; // Make node to be added as a next node
        }
    }

    // Adding node at the start of LinkedList
    public void addAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.nextNode = head; // shuffles head node to next node
        head = node; // Node to be added becomes the head node
    }

    // Adding node at a particular position
    public void addAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.nextNode = null;

        if (index == 0) // when there are no nodes
            addAtStart(data); // then addStart() adds node at the start
        else {

            Node n = head;
            for (int i = 0; i < index - 1; i++) { // iterate all nodes which are before a node at (index-1)
                n = n.nextNode;
            }
            node.nextNode = n.nextNode; // Node with index 'i' becomes next node
            n.nextNode = node;
        }
    }

    public void deleteAt(int index){
        if(index == 0){                 // If node to be deleted is at index 0 then 
            head = head.nextNode;       // make the next node as a head node
        }
        else{
            Node n = head;
           for(int i=0; i<index-1; i++){
                n = n.nextNode;
           }
            Node tempNode = n.nextNode; // Stores the address of next node in temp node
            n.nextNode = tempNode.nextNode;
        }
    }

    public void printData() {
        Node node = head;
        while (node.nextNode != null) {
            System.out.print(node.data + "\t");
            node = node.nextNode;
        }
        System.out.println(node.data);
    }

    /**
     * Creatu=ing inner class Node
     */
    public class Node {
        int data;
        Node nextNode;
    }
}