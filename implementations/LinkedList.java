package implementations;

public class LinkedList{
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(29);
        linkedList.add(65);
        linkedList.add(157);

        linkedList.addAtStart(25);

        linkedList.addAt(3, 55);
        linkedList.printData();
    }

    Node head;

    public void add(int data){
        Node node = new Node();
        node.data = data;
        node.nextNode = null;
        if(head == null){       // if there are no nodes then makes this node as head node
            head = node;
        }
        else{
            Node n = head;
            while(n.nextNode != null){      // iterate over whole list untill next node  
                n = n.nextNode;             // doesn't become null

            }
            n.nextNode = node;              //  Make node to be added as a next node
        }
    }

    // Adding node at the start of LinkedList
    public void addAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.nextNode = head; // shuffles head node to next node
        head = node;          // Node to be added becomes the head node
    }

    // Adding node at a particular position
    public void addAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.nextNode = null;

        if(index==0)                // when there are no nodes 
            addAtStart(data);       // then addStart() adds node at the start

        Node n = head;
        for(int i=0; i<index-1; i++){   // iterate all nodes which are before a node at (index-1)
            n = n.nextNode;
        }
        node.nextNode = n.nextNode; //  Node with index 'i' becomes next node
        n.nextNode = node;
    }

    public void printData(){
        Node node = head;
        while(node.nextNode != null){
            System.out.print(node.data+"\t");
            node = node.nextNode;
        }
        System.out.println(node.data);
    }


    /**
     * InnerLinkedList
     */
    public class Node {
        int data;
        Node nextNode;
    }
}