public class zadanie2 {
    public static void main(String[] args) {
        Ulamek ul1 = new Ulamek(8,10);
        Ulamek ul2 = new Ulamek(5,20);
        int licznik = skor(dzielenie(ul1,ul2)).getLicznik();
        int mianownik = skor(dzielenie(ul1,ul2)).getMianownik();
        System.out.println(licznik+"/"+mianownik);
    }

    public static Ulamek dzielenie(Ulamek ul1,Ulamek ul2) {
        int licznik = ul1.getLicznik() * ul2.getMianownik();
        int mianownik = ul1.getMianownik() * ul2.getLicznik();
        if (mianownik < 0) {
            licznik = -licznik;
            mianownik = -mianownik;
        }

        return new Ulamek(licznik, mianownik);
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

    public static Ulamek skor(Ulamek ul3) {
        int NWD = NWD(ul3.getLicznik(), ul3.getMianownik());
        return new Ulamek(ul3.getLicznik()/NWD, ul3.getMianownik()/NWD);
    }

}