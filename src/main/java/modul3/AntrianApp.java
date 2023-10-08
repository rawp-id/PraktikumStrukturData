package modul3;

class Antrian {
    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Antrian(int size) {
        this.maxSize = size;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(String value) {
        if (!isFull()) {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queArray[++rear] = value;
            System.out.println(value + " masuk antrian");
            nItems++;
        } else {
            System.out.println("Maaf " + value + ", antrian masih penuh");
        }

    }

    public String remove() {
        String temp = queArray[front];
        queArray[front] = "Kosong";
        front++;
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public void display() {
        int temp = this.front;
        for (int i = 0; i < maxSize; i++) {
            System.out.print(queArray[front++] + ", ");
            if (front == maxSize) {
                front = 0;
            }
        }
        System.out.println();
        front = temp;
    }

    public String peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }
}

public class AntrianApp {
    public static void main(String[] args) {
        Antrian antrian = new Antrian(4);
        System.out.println(">> beberapa mulai mengantri");
        antrian.insert("Andi");
        antrian.insert("Ahmad");
        antrian.insert("Satrio");
        antrian.insert("Afrizal");
        antrian.insert("Sukran");
        antrian.insert("Mahmud");
        System.out.println("\n>> isi antrian");
        antrian.display();
        System.out.println("\n>> satu persatu keluar antrian");
        System.out.println(antrian.remove() + " Keluar antrian");
        antrian.display();
        System.out.println("\n" + antrian.remove() + "Keluar antrian");
        antrian.display();
        System.out.println("\n" + antrian.remove() + "Keluar antrian");
        antrian.display();
        System.out.println("\n" + antrian.remove() + " Keluar antrian");
        antrian.display();
        System.out.println("\nantrian kosong\n" + antrian.size() + "Person");
        antrian.display();
    }
}

