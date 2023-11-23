import java.util.Scanner;

public class zadanie4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj długość boku a: ");
        int a = scanner.nextInt();

        System.out.print("Podaj długość boku b: ");
        int b = scanner.nextInt();

        int iloscKwadratow = minimalneKwadraty(a, b);

        System.out.println("Najmniejsza liczba różnych kwadratów: " + iloscKwadratow);
    }

    private static int minimalneKwadraty(int a, int b) {
        int iloscKwadratow = 0;
        int aktualnyBok = Math.min(a, b);

        while (a > 0 && b > 0) {
            if (a >= b) {
                a -= aktualnyBok;
            } else {
                b -= aktualnyBok;
            }

            iloscKwadratow++;
            aktualnyBok = Math.min(a, b);
        }

        return iloscKwadratow;
    }
}
