public class RozmiarStringITablicy {
  public static void main(String[] args) {
    String tekst = "Witajcie!";

    String[] slowa = { "Ania", "ma", "kota" };

    System.out.println("Liczba slow w zmiennej tekst: " + tekst.length());

    System.out.println("Liczba elementow w tablicy: " + slowa.length);

    System.out.println(
        "Liczba znakow w pierwszym slowie z tablicy: " + slowa[0].length()
    );
  }
}
