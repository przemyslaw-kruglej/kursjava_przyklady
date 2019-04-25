public class Pojazd {
    private final String marka;
    private final String numerRejestracyjny;
    private final int rokProdukcji;

    public Pojazd(String marka, String numerRejestracyjny, int rokProdukcji) {
        this.marka = marka;
        this.numerRejestracyjny = numerRejestracyjny;
        this.rokProdukcji = rokProdukcji;
    }

    public String toString() {
        return "Pojazd marki " + marka +
                ", numer rejestracjny " + numerRejestracyjny +
                ", wyprodukowany w " + getRokProdukcji() + " roku.";
    }

    public String getMarka() {
        return marka;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public static void main(String[] args) {
        Pojazd motor = new Pojazd("Harley", "978654", 2017);
        Pojazd samochod = new Pojazd("Toyota", "123456", 1997);

        System.out.println(motor);
        System.out.println(samochod);
    }
}
