public class TestowanieDoKwadratu {
    public static void main(String[] args) {
        doKwadratu_wartoscDodatnia_wartoscPodniesionaDoKwadratu();
        doKwadratu_wartoscUjemna_wartoscPodniesionaDoKwadratu();
        doKwadratu_liczbaZero_zero();
    }

    public static int doKwadratu(int x) {
        return x * x;
    }

    public static void doKwadratu_wartoscDodatnia_wartoscPodniesionaDoKwadratu() {
        int wynik = doKwadratu(20);

        if (wynik != 400) {
            System.out.println("Dla liczby 20 wyliczono nieprawidlowy kwadrat: " + wynik);
        }
    }

    public static void doKwadratu_wartoscUjemna_wartoscPodniesionaDoKwadratu() {
        int wynik = doKwadratu(-5);

        if (wynik != 25) {
            System.out.println("Dla liczby -5 wyliczono nieprawidlowy kwadrat: " + wynik);
        }
    }

    public static void doKwadratu_liczbaZero_zero() {
        int wynik = doKwadratu(0);

        if (wynik != 0) {
            System.out.println("Dla liczby 0 wyliczono nieprawidlowy kwadrat: " + wynik);
        }
    }
}
