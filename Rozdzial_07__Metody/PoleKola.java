public class PoleKola {
    public static void main(String[] args) {
        System.out.println("Pole kola o promieniu 2 wynosi " + obliczPoleKola(2));
    }

    public static double obliczPoleKola(int promienKola) {
        double promienDoKwadratu = promienKola * promienKola;

        return 3.14 * promienDoKwadratu;
    }
}
