package implementations;

public class LinkedList{
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(29);
        linkedList.add(65);
        linkedList.add(157);

        linkedList.printData();
    }

    Node head;

    public void add(int data){
        Node node = new Node();
        node.setData(data);
        node.setNextNode(null);
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.getNextNode() != null){
                n = n.getNextNode();
            }
            n.setNextNode(node);
        }
    }

    public void printData(){
        Node node = head;
        while(node.getNextNode() != null){
            System.out.print(node.getData()+"\t");
            node = node.getNextNode();
        }
        System.out.println(node.getData());
    }
}

class Node{
    private int data;
    private Node nextNode;

    public Node() {
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}