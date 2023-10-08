package modul5;

public class Triangular_Number {

    // Method iteratif untuk menghitung bilangan segitiga
    public int triangleIter(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            result += i;
        }
        return result;
    }

    // Method rekursif untuk menghitung bilangan segitiga
    public int triangleRecur(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + triangleRecur(n - 1);
        }
    }

    public static void main(String[] args) {
        TriangularNumber tn = new TriangularNumber();
        int n = 5;

        // Menggunakan metode iteratif
        int resultIter = tn.triangleIter(n);
        System.out.println("Hasil dengan iterasi: " + resultIter);

        // Menggunakan metode rekursif
        int resultRecur = tn.triangleRecur(n);
        System.out.println("Hasil dengan rekursi: " + resultRecur);
    }
}

