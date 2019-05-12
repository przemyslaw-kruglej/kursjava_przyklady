public class PrzykladMetodyStatycznej {
  private String poleInstancji;

  private static int poleStatyczne = 20;

  public void metodaInstancji() {
    System.out.println("Wywolales metode instancji.");
    // odwolanie do pola niestatycznego
    System.out.println(
        "poleInstancji (w metodzieInstancji): " + poleInstancji
    );
    // odwolanie do pola statycznego
    System.out.println(
        "poleStatyczne (w metodzieInstancji): " + poleStatyczne
    );
    System.out.println("Wywoluje metode statyczna z metody instancji:");
    // wywolanie metody statycznej
    metodaStatyczna();
  }

  public static void metodaStatyczna() {
    System.out.println("Wywolales metode statyczna.");

    // blad!
    // kod zakomentowany - nie mozemy w metodzie statycznej
    // korzystac z pola niestatycznego
    //System.out.println(
    //    "poleInstancji (w metodzieStatycznej):" + poleInstancji
    //);

    // ok - mozemy w metodzie statycznej
    // korzystac z pol statycznych
    System.out.println(
        "poleStatyczne (w metodzieStatycznej): " + poleStatyczne
    );

    // blad!
    // nie mozemy tutaj wywolac metody niestatycznej
    // metodaInstancji();

    System.out.println(); // pusta linia
  }

  public static void main(String[] args) {
    System.out.println("Wywoluje metode statyczne za pomoca klasy");
    PrzykladMetodyStatycznej.metodaStatyczna(); // 1

    System.out.println("Tworze obiekt klasy PrzykladMetodyStatycznej");
    PrzykladMetodyStatycznej obiekt = new PrzykladMetodyStatycznej();
    obiekt.metodaInstancji(); // 2
    obiekt.metodaStatyczna(); // 3
  }
}
