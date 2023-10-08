package UTS;

public class Segitiga {
    int Segitiga(int n){
        if (n == 1) {
            return 1;
        } else {
            return n + Segitiga(n - 1);
        }
    }

    public static void main(String[] args) {
        Segitiga sgtg = new Segitiga();
        for (int i = 1; i <= 10; i++) {
            System.out.print(sgtg.Segitiga(i) + ", ");
        }
    }
}
