package modul3;

import java.util.Scanner;

class StackNew {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackNew(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char item) {
        stackArray[++top] = item;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}


class Reverse {

    public void change(String isi, StackNew st) {
        for (int i = 0; i < isi.length(); i++) {
            char simpan = isi.charAt(i);
            st.push(simpan);
        }
    }

    public String result(StackNew st) {
        String value = "";
        while (!st.isEmpty()) {
            value += st.pop();

        }
        return value;
    }
}

public class ReverseApp {

    public static void main(String[] args) {

        System.out.println("(A)");

        Reverse balik1 = new Reverse();
        StackNew st1 = new StackNew(5);
        String input = "kasur";
        balik1.change(input, st1);
        String output = balik1.result(st1);

        System.out.println(">> katanya...");
        System.out.println("\t" + input);
        System.out.println(">> dibalik jadi...");
        System.out.println("\t" + output);

        System.out.println("\n(B)");

        for (int i = 0; i < 5; i++) {
            Scanner inputText = new Scanner(System.in);
            Reverse balik2 = new Reverse();
            StackNew st2 = new StackNew(10);

            System.out.print("Masukkan kata : ");
            String in = inputText.next();

            balik2.change(in, st2);
            String out = balik2.result(st2);

            System.out.println("Kebalikan : " + out);
        }
    }
}
