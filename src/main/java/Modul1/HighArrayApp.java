package Modul1;

class HighArray {
    private int[] arr;
    private int nElemen;

    public HighArray(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public boolean find(int key) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (arr[i] == key) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            return true;
        }
    }

    public boolean delete(int value) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (value == arr[i]) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            for (int j = i; j < nElemen; j++) {
                arr[j] = arr[j + 1];
            }
            nElemen--;
            return true;
        }
    }

    public int binarySeacrh(int searcKey) {
        int lowerBound = 0;
        int upperBound = nElemen - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (arr[curIn] == searcKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElemen;
            } else {
                if (arr[curIn] < searcKey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void search(int key) {
        if (binarySeacrh(key) == nElemen) {
            System.out.println("Data Tidak Ditemukan");
        } else {
            System.out.println("Data ditemukan pada index ke-" + binarySeacrh(key));
        }
    }

    public void insertShift(int value) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (arr[i] > value) {
                break;
            }
        }
        for (int j = nElemen; j > i; j--) {
            arr[j] = arr[j - 1];
        }
        arr[i] = value;
        nElemen++;
    }

    public int size() {
        return nElemen;
    }


    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}

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
        arr.insert(30);
        arr.insert(70);
        arr.insert(90);
        arr.insert(40);
        arr.display();
        int key = 25;
        if (arr.find(key)) {
            System.out.println(key +
                    " ditemukan");
        } else {
            System.out.println(key +
                    " tidak ditemukan");
        }
        arr.delete(00);
        arr.delete(80);
        arr.delete(55);
//        arr.insertShift(15);
//        arr.insertShift(30);
//        arr.insertShift(45);
//        arr.insertShift(53);
//        arr.insertShift(77);
//        arr.insertShift(79);
//        arr.insertShift(81);
//        arr.display();
//        int insert = 66;
//        System.out.println("Data yang di insert : "+insert);
//        arr.insertShift(insert);
        arr.display();
        arr.search(77);
        System.out.println("jumlah elemen : " + arr.size());
    }
}
