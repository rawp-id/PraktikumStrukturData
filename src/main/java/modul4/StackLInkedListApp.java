package modul4;

import java.util.Stack;

class LinkApp {
    public int id;
    public String name;
    public LinkApp next;

    public LinkApp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayLink() {
        System.out.println("(" + id + ", " + name + ")");
    }
}

class StackList {
    private LinkApp first;

    public StackList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void push(int id, String nama) {
        LinkApp newLink = new LinkApp(id, nama);
        newLink.next = first;
        first = newLink;
    }

    public LinkApp pop() {
        LinkApp temp = first;
        first = first.next;
        return temp;
    }

    public void display() {
        System.out.println("List(top-->bottom):");
        LinkApp current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}

public class StackLInkedListApp {
    public static void main(String[] args) {
        StackList theList = new StackList();
        theList.push(1,"VCD");
        theList.push(2,"TV");
        theList.display();

        theList.push(3,"Kulkas");
        theList.push(4,"PC");
        theList.push(5,"rice Cooker");
        theList.push(6,"dispenser");
        theList.display();

        theList.pop();
        theList.pop();
        theList.display();
    }
}
