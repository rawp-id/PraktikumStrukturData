package modul5;

import java.util.Scanner;

public class Hanoi {
    public void doMenara(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Cakram " + n + " Dari " + a + " Ke-" + c);
            return;
        }
        doMenara(n - 1, a, c, b);
        System.out.println("Cakram " + n + " Dari " + a + " Ke-" + c);
        doMenara(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah cakram : ");
        int n = scanner.nextInt();
        Hanoi hanoi = new Hanoi();
        hanoi.doMenara(n, 'A', 'B', 'C');
    }
}
