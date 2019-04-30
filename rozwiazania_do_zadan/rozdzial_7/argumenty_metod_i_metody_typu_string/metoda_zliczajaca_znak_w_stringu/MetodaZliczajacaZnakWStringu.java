public class MetodaZliczajacaZnakWStringu {
  public static void main(String[] args) {
    System.out.println(zliczZnaki("Ala ma kota", 'a'));
    System.out.println(zliczZnaki("Ala ma kota", 'A'));
    System.out.println(zliczZnaki("Ala ma kota", 'x'));
  }

  public static int zliczZnaki(String tekst, char znak) {
    int liczbaZnakow = 0;

    for (int i = 0; i < tekst.length(); i++) {
      if (tekst.charAt(i) == znak) {
        liczbaZnakow++;
      }
    }

    return liczbaZnakow;
  }
}