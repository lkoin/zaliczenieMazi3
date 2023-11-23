import java.util.Scanner;

public class zadanie5 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj liczbę dużych bombek (n): ");
            int liczbaDuzychBombek = scanner.nextInt();

            System.out.print("Podaj liczbę małych bombek (m): ");
            int liczbaMalychBombek = scanner.nextInt();

            int nww = nww(liczbaDuzychBombek, liczbaMalychBombek);

            int pudełkaDuże = nww / liczbaDuzychBombek;
            int pudełkaMałe = nww / liczbaMalychBombek;

            System.out.println("Aby mieć równą liczbę dużych i małych bombek, musisz otworzyć:");
            System.out.println("Pudełek z dużymi bombkami: " + pudełkaDuże);
            System.out.println("Pudełek z małymi bombkami: " + pudełkaMałe);


        }

        private static int nww(int a, int b) {
            return (a * b) / NWD(a, b);
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
    }

