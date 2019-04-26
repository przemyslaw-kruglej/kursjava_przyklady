public class StringReplace {
  public static void main(String[] args) {
    String tekst = "Ala ma kota";

    String zmianaImienia = tekst.replace("Ala", "Jola");
    String bezSpacji = tekst.replace(" ", "");

    System.out.println("Tekst z innym imieniem: " + zmianaImienia);
    System.out.println("Tekst bez spacji: " + bezSpacji);
  }
}
