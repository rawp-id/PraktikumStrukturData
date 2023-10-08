package modul4;

class QueueLink {
    public int nim;
    public String nama;
    public QueueLink next;
    public QueueLink previous;

    public QueueLink(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void displayLink() {
        System.out.print("\n\t\t" + nim + " " + nama);
    }
}

class QueueLinkedList {
    private QueueLink first;
    private QueueLink last;

    public QueueLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(int nim, String nama) {
        QueueLink newLink = new QueueLink(nim,nama);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public QueueLink remove() {
        QueueLink temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public QueueLink deleteLast() {
        QueueLink temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public void displayForward() {
        System.out.print("List " + "(front --> rear): ");
        QueueLink current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}

public class QueueLinkedListApp {
    public static void main(String[] args) {
        QueueLinkedList theList = new QueueLinkedList();
        theList.insert(1665100, "Dee");
        theList.insert(1665200, "Deeja");
        theList.displayForward();
        System.out.println();
        theList.insert(1665300,"Ami");
        theList.insert(1665400,"Haya");
        theList.insert(1665500,"Yati");
        theList.displayForward();
        System.out.println();
        theList.remove();
        theList.remove();
        theList.displayForward();
    }
}