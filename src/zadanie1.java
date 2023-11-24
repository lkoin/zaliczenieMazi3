import static java.lang.Math.max;

public class zadanie1 {
    public static void main(String[] args) {
        Ulamek ul1 = new Ulamek(-8,10);
        Ulamek ul2 = new Ulamek(-4,15);
        int licznik = skor(dzielenie(ul1,ul2)).getLicznik();
        int mianownik = skor(dzielenie(ul1,ul2)).getMianownik();
        System.out.println(licznik+"/"+mianownik);
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

    public static Ulamek dzielenie(Ulamek ul1, Ulamek ul2) {
      int licznik = ul1.getLicznik() * ul2.getMianownik() - ul2.getLicznik() * ul1.getMianownik();
      int mianownik = ul1.getMianownik() * ul2.getMianownik();
      return new Ulamek(licznik, mianownik);

    }



    public static Ulamek skor(Ulamek ul3) {
        if (ul3.getLicznik() > 0) {
            int NWD = NWD(ul3.getLicznik(), ul3.getMianownik());
            return new Ulamek(ul3.getLicznik()/NWD, ul3.getMianownik()/NWD);
        }
        else {
            int NWD = NWD(ul3.getLicznik() * -1, ul3.getMianownik());
            return new Ulamek(ul3.getLicznik()/NWD, ul3.getMianownik()/NWD);
        }

    }


}