package rozdzial_7_Klasy;

import java.util.Arrays;

public class Koszyk {
    private Owoc[] owoce;
    private boolean oplacony;

    public Koszyk(Owoc[] owoce, boolean oplacony) {
        this.owoce = owoce;
        this.oplacony = oplacony;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Koszyk other = (Koszyk) o;

        if (this.oplacony != other.oplacony) {
            return false;
        }

        // jezeli obie tablice sa ta sama tablica w pamieci
        // lub obie tablice sa nullem, to zwracamy true
        if (this.owoce == other.owoce) {
            return true;
        }

        if (this.owoce == null || other.owoce == null) {
            return false;
        }

        // tablice moga byc rowne, gdy obie maja tyle samo elementow
        // jezeli liczba elementow sie rozni - zwracamy false
        if (this.owoce.length != other.owoce.length) {
            return false;
        }

        for (int i = 0; i < this.owoce.length; i++) {
            // jezeli para obiektow z obu tablic pod danym indeksem
            // sie rozni, to zwracamy false
            Owoc o1 = this.owoce[i];
            Owoc o2 = other.owoce[i];

            if ((o1 == null && o2 != null) ||
                (o1 != null && !o1.equals(o2))) {
                return false;
            }
        }

        // jezeli dotarlismy do tego miejsca, to znaczy, ze nie znalezlismy
        // zadnej roznicy pomiedzy obiekami this i other
        return true;

        // powyzsze porownywanie tablic mozna zastapic poprzez uzycie
        // Arrays.equals
        //return Arrays.equals(this.owoce, other.owoce);
    }

    public static void main(String[] args) {
        Owoc czeresnie = new Owoc("Czeresnie", 10.0);
        Owoc jablko = new Owoc("Jablko", 5.0);

        Koszyk koszyk1 = new Koszyk(new Owoc[] { czeresnie, jablko }, false);
        Koszyk koszyk2 = new Koszyk(new Owoc[] { czeresnie, jablko }, true);
        Koszyk koszyk3 = new Koszyk(new Owoc[] { czeresnie, jablko }, false);
        Koszyk koszyk4 = new Koszyk(null, false);
        Koszyk koszyk5 = new Koszyk(new Owoc[] { jablko, czeresnie }, false);
        Koszyk koszyk6 = new Koszyk(new Owoc[] { czeresnie, jablko, czeresnie }, false);

        System.out.println(koszyk1.equals(koszyk2));
        System.out.println(koszyk1.equals(koszyk3));
        System.out.println(koszyk1.equals(koszyk4));
        System.out.println(koszyk1.equals(koszyk5));
        System.out.println(koszyk1.equals(koszyk6));
        System.out.println(koszyk1.equals(null));
    }
}
