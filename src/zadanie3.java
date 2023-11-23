import java.util.Scanner;

import static java.lang.Math.pow;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok a");
        int a = scanner.nextInt();
        System.out.println("Podaj bok b");
        int b = scanner.nextInt();
        System.out.println(Kwadraty(a,b));
    }

    public static int NWD(int x, int y) {
        while (x != y) {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        return x;
    }

    public static int Kwadraty(int a,int b) {
        int NWD = NWD(a,b);
        int potega = NWD*NWD;
        return (a*b)/potega;
    }
}