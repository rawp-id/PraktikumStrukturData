package modul5;
class Arrays {
    private int arr[];
    private int nElement;

    public Arrays(int size) {
        arr = new int[size];
        nElement = 0;
    }

    public void insert(int value) {
        arr[nElement] = value;
        nElement++;
    }

    public void display() {
        for (int i = 0; i < nElement; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void mergeSort() {
        int[] workSpace = new int[nElement];
        recMergeSort(workSpace, 0, nElement - 1);
    }

    public void recMergeSort(int[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid + 1, upperBound);
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }

    }

    private void merge(int[] workSpace, int lowIndex, int highIndex, int upperBound) {
        int j = 0;
        int lowerBound = lowIndex;
        int mid = highIndex - 1;
        int nItem = upperBound - lowerBound + 1;

        while (lowIndex <= mid && highIndex <= upperBound) {
            if (arr[lowIndex] < arr[highIndex]) {
                workSpace[j++] = arr[lowIndex++];
            } else {
                workSpace[j++] = arr[highIndex++];
            }
        }
        while (lowIndex <= mid) {
            workSpace[j++] = arr[lowIndex++];
        }
        while (highIndex <= upperBound) {
            workSpace[j++] = arr[highIndex++];
        }
        for (j = 0; j < nItem; j++) {
            arr[lowerBound + j] = workSpace[j];
        }
    }
}

public class ArraysApp {
    public static void main(String[] args) {
        Arrays arrays = new Arrays(10);

        arrays.insert(10);
        arrays.insert(1);
        arrays.insert(3);
        arrays.insert(5);
        arrays.insert(8);
        arrays.insert(2);
        arrays.insert(4);
        arrays.insert(6);
        arrays.insert(9);
        arrays.insert(8);

        System.out.print("Array Sebelum Sort : ");
        arrays.display();

        arrays.mergeSort();
        System.out.print("Array Setelah Sort : ");
        arrays.display();

    }
}
