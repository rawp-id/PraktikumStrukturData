package modul2;


public class HighArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
//        arr.insert(30);
//        arr.insert(00);
//        arr.insert(90);
//        arr.insert(40);

//        arr.display();

//        arr.SelectionSort();
//        arr.display();

//        System.out.println("array belum terurut : ");
//        arr.display();
//        System.out.println();
//        System.out.println("Selection Sort :");
//        arr.SelectionSort();
//        System.out.println();
//        System.out.println("array sudah terurut : ");
//        arr.display();

        arr.InsertionSort();
        arr.display();

    }
}