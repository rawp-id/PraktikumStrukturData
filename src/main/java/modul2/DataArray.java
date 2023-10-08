package modul2;

public class DataArray {
    private Mahasiswa[] mhs;
    private int nElemen;

    public DataArray(int max) {
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }

    public Mahasiswa find(long searchNim) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (mhs[i].getNim() == searchNim) {
                break;
            }
        }
        if (i == nElemen) {
            return null;
        } else {
            return mhs[1];
        }
    }

    public void insert(long nim, String name, String asal) {
        mhs[nElemen] = new Mahasiswa(nim, name, asal);
        nElemen++;
    }

    public boolean delete(long searchNim) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (mhs[i].getNim() == searchNim) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            for (int j = 1; j < nElemen; j++) {
                mhs[j] = mhs[j + 1];

            }
            nElemen--;
            return true;
        }

    }

    public void displayArray() {
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
    }

    public void BubbleSort() {
        int batas, i;
        for (batas = nElemen - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (mhs[i].getNim() > mhs[i + 1].getNim()) {
                    swap(i, i + 1);
                }
            }
//            System.out.println(batas - i);
//            display();
        }
    }

    public void swap(int one, int two) {
        Mahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }

    public void SelectionSortByName() {
        int awal, i, min;
        for (awal = 0; awal < nElemen - 1; awal++) {
            min = awal;
            for (i = awal + 1; i < nElemen; i++) {
                int compare = mhs[i].getNama().compareTo(mhs[min].getNama());
                if (compare<0) {
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
            Mahasiswa temp = mhs[curIn];
            i = curIn;
            while (i > 0 && mhs[i - 1].getNim() >= temp.getNim()) {
                mhs[i] = mhs[i - 1];
                i--;
            }
//            display();
            mhs[i] = temp;
//            display();
        }
    }
}