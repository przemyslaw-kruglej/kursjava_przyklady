// ponizszy program sie nie skompiluje, poniewaz
//  w metodzie main probujemy sie odniesc do zmiennej
//  promienDoKwadratu, ktora w tej metodzie jest niedostepna
public class PoleKolaZBledem {
    public static void main(String[] args) {
        System.out.println("Pole kola o promieniu 2 wynosi " + obliczPoleKola(2));

        // w metodzie main zmienna promienDoKwadratu nie istnieje,
        //  wiec kompilator zaprotestuje!
        System.out.println("Promien kola do kwadratu wynosi: " + promienDoKwadratu);
    }

    public static double obliczPoleKola(int promienKola) {
        // zmienna promienDoKwadratu dostepna jest od ponizszej linii
        double promienDoKwadratu = promienKola * promienKola;

        return 3.14 * promienDoKwadratu;
    } // metoda sie konczy, zmienna promienDoKwadratu przestaje istniec
}
