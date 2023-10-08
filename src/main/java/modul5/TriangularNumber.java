package modul5;

public class TriangularNumber {
    public int triangleIter(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            result += i;
        }
        return result;
    }

    public int triangleRecur(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + triangleRecur(n - 1);
        }
    }

    public int faktorialIter(int n) {
        int result = n;
        for (int i = n; i > 1; ) {
            result *= (--i);
        }
        return result;
    }

    public int faktorialRecur(int n) {
        int result = n;
        if (n != 1) {
            return n * faktorialRecur(n - 1);
        }
        return n;
    }

    public static void main(String[] args) {
        TriangularNumber triangle = new TriangularNumber();

        int n = 5;

        System.out.println("Iteration of " + n + " = " + triangle.triangleIter(n));
        System.out.println("Recurtion of " + n + " = " + triangle.triangleRecur(n));

        System.out.println("Itteration of " + n + "! = " + triangle.faktorialIter(n));
        System.out.println("Recurtion of " + n + "! = " + triangle.faktorialRecur(n));
    }
}
