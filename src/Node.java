public class Node {
    private String value;
    private Node next;

    public Node(String value){
        this(value, null);
    }

    public Node(String value, Node next){
        this.value = value;
        this.next = next;
    }

    public String getValue(){
        return value;

    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void replaceNext(Node next){
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
