public class MetodaCzyPalindrom {
  public static void main(String[] args) {
    System.out.println(
        "Czy kajak to palindrom? " + czyPalindrom("kajak")
    );

    System.out.println(
        "Czy Kajak to palindrom? " + czyPalindrom("Kajak")
    );

    System.out.println(
        "Czy kot to palindrom? " + czyPalindrom("kot")
    );
  }

  public static boolean czyPalindrom(String slowo) {
    String slowoMaleLitery = slowo.toLowerCase();
    int dlugoscSlowa = slowo.length();

    for (int i = 0; i < dlugoscSlowa / 2; i++) {
      if (slowoMaleLitery.charAt(i) != slowoMaleLitery.charAt(dlugoscSlowa - 1 - i)) {
        return false;
      }
    }

    return true;
  }
}
