public class Sklep {
    public static void main(String[] args) {
        Produkt czeresnie = new Produkt();
        Produkt herbata = new Produkt();

        czeresnie.setCena(8.0);
        czeresnie.setNazwa("Czeresnie");

        herbata.setCena(12.0);
        herbata.setNazwa("Herbata czarna");

        System.out.println("Nazwa pierwszego produktu to: " + czeresnie.getNazwa());
        System.out.println("Cena pierwszego produktu to: " + czeresnie.getCena());
        System.out.println(herbata);
    }
}
