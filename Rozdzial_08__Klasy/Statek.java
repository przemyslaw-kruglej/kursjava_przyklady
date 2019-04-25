public class Statek {
    public int liczbaZagli = 2;
    public String nazwa = "nienazwany statek";

    public String toString() {
        return "Statek o nazwie '" + nazwa + "' ma " + liczbaZagli + " zagle.";
    }

    public static void main(String[] args) {
        Statek nieznanyStatek = new Statek();

        Statek hammond = new Statek();
        hammond.nazwa = "Hammond";

        System.out.println(nieznanyStatek);
        System.out.println(hammond);
    }
}
