public class PrzykladGetClass {
  public static void main(String[] args) {
    Osoba osoba = new Osoba("Jan", "Kowalski", 35);
    String powitanie = "Witajcie!";
    Object pewienObiekt = new Osoba("Marek", "Nowak", 30);

    System.out.println(osoba.getClass());
    System.out.println(powitanie.getClass());
    System.out.println(pewienObiekt.getClass());

    if (pewienObiekt.getClass() == powitanie.getClass()) {
      System.out.println("Klasy obiektu 'pewienObiekt' i 'powitanie' " +
              "sa takie same.");
    } else {
      System.out.println("Klasy obiektu 'pewienObiekt' i 'powitanie' " +
              "sa rozne.");
    }

    if (pewienObiekt.getClass() == osoba.getClass()) {
      System.out.println("Klasy obiektu 'pewienObiekt' i 'osoba' " +
              "sa takie same.");
    } else {
      System.out.println("Klasy obiektu 'pewienObiekt' i 'osoba' " +
              "sa rozne.");
    }
  }
}
