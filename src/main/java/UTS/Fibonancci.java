package UTS;

public class Fibonancci {
    int Fibonanci(int n) {
        if (n == 0) {
            return 0;
        }else if (n == 1 || n == 2) {
            return 1;
        }else {
            return Fibonanci(n - 1) + Fibonanci(n - 2);
        }
    }

    public static void main(String[] args) {
        Fibonancci fbnc = new Fibonancci();

        for (int i = 1; i <= 10; i++) {
            System.out.print(fbnc.Fibonanci(i) + ", ");
        }
    }
}
