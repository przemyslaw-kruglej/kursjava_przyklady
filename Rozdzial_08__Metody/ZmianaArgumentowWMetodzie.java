public class ZmianaArgumentowWMetodzie {
    public static void main(String[] args) {
        int x = 5;
        int[] tablicaWartosci = { 1, 2, 3 };

        doKwadratu(x);
        wszystkieDoKwadratu(tablicaWartosci);

        System.out.println("X wynosi " + x);

        for (int i = 0; i < tablicaWartosci.length; i++) {
            System.out.println("Element tablicy o indeksie " + i +
                " wynosi " + tablicaWartosci[i]);
        }
    }

    public static void doKwadratu(int liczba) {
        liczba = liczba * liczba;
    }

    public static void wszystkieDoKwadratu(int[] tablicaLiczb) {
        for (int i = 0; i < tablicaLiczb.length; i++) {
            tablicaLiczb[i] = tablicaLiczb[i] * tablicaLiczb[i];
        }
    }
}
