
public class Main {
    private static suitorlist ll;
    public static void main(String[] args) {



        ll = new suitorlist();
        ll.addNode("Suitor 1");
        ll.addNode("Suitor 2");
        ll.addNode("Suitor 3");
        ll.addNode("Suitor 4");
        ll.addNode("Suitor 5 ");
        ll.addNode("Suitor 6");
        ll.addNode("Suitor 7");
        System.out.print("before : ");
        ll.printList();
        System.out.println("after : ");
        ll.removeSuitor();





    }
}