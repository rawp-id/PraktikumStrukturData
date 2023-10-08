package UTS;

public class BubbleSort {
    private int[] arr;
    private int nElemen;

    public BubbleSort(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public void BubbleSort() {
        int batas, i;
        for (batas = nElemen - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (arr[i] < arr[i + 1]) {
                    swap(i, i + 1);
                }
            }
        }
    }

    public void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        BubbleSort BS = new BubbleSort(9);
        BS.insert(9);
        BS.insert(7);
        BS.insert(5);
        BS.insert(4);
        BS.insert(2);
        BS.insert(6);
        BS.insert(8);
        BS.insert(1);
        BS.insert(3);

        System.out.println("Data Sebelum di Sorting : ");
        BS.display();

        BS.BubbleSort();
        System.out.println("\nData Setelah di Sorting : ");
        BS.display();
    }
}
