package rozdzial_7_Klasy;

public class Owoc {
    private String nazwa;
    private double cena;

    public Owoc(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Owoc other = (Owoc) o;

        if ((this.nazwa == null && other.nazwa != null) ||
            (this.nazwa != null && !this.nazwa.equals(other.nazwa))) {
            return false;
        }

        return this.cena == other.cena;
    }

    public static void main(String[] args) {
        Owoc o1 = new Owoc("a", 2.0);
        Owoc o2 = new Owoc("a", 2.0);
        Owoc o3 = new Owoc("a", 2.1);
        Owoc o4 = new Owoc(null, 2.1);
        Owoc o5 = new Owoc(null, 2.1);

        System.out.println(o1.equals(null));
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1.equals(o4));
        System.out.println(o4.equals(o5));
        System.out.println(o4.equals(o1));
    }
}
