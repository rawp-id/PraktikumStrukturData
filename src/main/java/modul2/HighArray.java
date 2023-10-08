package modul2;

public class HighArray {
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

    public void BubbleSort() {
        int batas, i;
        for (batas = nElemen - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(i, i + 1);
                }
            }
//            System.out.println(batas - i);
//            display();
        }
    }

    public void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public void SelectionSort() {
        int awal, i, min;
        for (awal = 0; awal < nElemen - 1; awal++) {
            min = awal;
            for (i = awal + 1; i < nElemen; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            swap(awal, min);
//            System.out.print("Step " + (awal + 1) + " : ");
//            display();
        }
    }

    public void InsertionSort() {
        int i, curIn;
        for (curIn = 1; curIn < nElemen; curIn++) {
            int temp = arr[curIn];
            i = curIn;
            while (i > 0 && arr[i - 1] >= temp) {
                arr[i] = arr[i - 1];
                i--;
            }
//            display();
            arr[i] = temp;
//            display();
        }
    }

}
