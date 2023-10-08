package modul5;

public class Exponent {
    public int exponent(int base, int exp) {
        if(exp!=0){
            return base * exponent(base, exp - 1);
        }
        return 1;
    }

    public static void main(String[] args) {
        Exponent e = new Exponent();

        System.out.println("2^10 = " + e.exponent(2, 10));
        System.out.println("3^5 = " + e.exponent(3, 5));
        System.out.println("3^16 = " + e.exponent(3, 16));
    }
}
