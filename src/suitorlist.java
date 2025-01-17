public class suitorlist {
    private Node HeadNode;


    public suitorlist(){
        HeadNode = null;
    }




    public void removeNode(String value){
        Node temp = HeadNode;
        Node sfgc = getLastNode();

        if (HeadNode == null) return;
        while (!temp.getValue().equalsIgnoreCase(value)){
            sfgc = sfgc.getNext();
            temp = temp.getNext();
        }
        Node aftertemp = temp.getNext();
        sfgc.replaceNext(aftertemp);
        if (value.equalsIgnoreCase(HeadNode.getValue())){
            HeadNode = aftertemp;
        }
    }

    public void printList(){
        Node temp = HeadNode;
       while ( temp.getNext() != HeadNode){
           System.out.print(temp.getValue()+", ");
           temp= temp.getNext();
       }
        System.out.println(temp.getValue());
    }




    public Node getLastNode() {
            Node temp = HeadNode;
            if (HeadNode == null) return null;

            while (temp.getNext() != HeadNode) {
                temp = temp.getNext();
            }
            return temp;
        }

    public void addNode(String value){
        Node newnode = new Node(value);
        if (HeadNode == null){
            HeadNode = newnode;
            HeadNode.setNext(HeadNode);
        }
        else {
            Node temp = HeadNode;
            while (temp.getNext() != HeadNode) {
                temp = temp.getNext();
            }

            newnode.setNext(HeadNode);
            temp.setNext(newnode);
        }

    }

    public void removeSuitor(){
        int count = 1;
        Node temp = HeadNode;
        Node t = null;
        while (temp.getNext() != temp) {
            while(count <= 2) {
                 t = temp;
                temp = temp.getNext();
                count++;
            }

            removeNode(temp.getValue());
            temp = t;
            count = 0;
            System.out.print("remaining Suitors: ");
            printList();
        }
    }


}
