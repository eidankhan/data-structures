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
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.nextNode != null){
                n = n.nextNode;

            }
            n.nextNode = node;
        }
    }

    public void addAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.nextNode = head;
        head = node;
    }

    public void addAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.nextNode = null;

        if(index==0)   
            addAtStart(data);

        Node n = head;
        for(int i=0; i<index-1; i++){
            n = n.nextNode;
        }
        node.nextNode = n.nextNode; //
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