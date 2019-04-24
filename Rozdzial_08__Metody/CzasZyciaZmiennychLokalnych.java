public class CzasZyciaZmiennychLokalnych {
    public static void main(String[] args) {
        testowaMetoda(10);
        testowaMetoda(20);
    }

    public static void testowaMetoda(int liczba) {
        int zmiennaLokalna = 0;

        zmiennaLokalna = zmiennaLokalna + liczba;

        System.out.println(zmiennaLokalna);
    }
}
