public class StringSubstring {
  public static void main(String[] args) {
    String tekst = "Ala ma kota";

    String pierwszeSlowo = tekst.substring(0, 3);
    String drugieSlowo = tekst.substring(4, 6);
    String trzecieSlowo = tekst.substring(7, tekst.length());

    System.out.println("Pierwsze slowo: " + pierwszeSlowo);
    System.out.println("Drugie slowo: " + drugieSlowo);
    System.out.println("Trzecie slowo: " + trzecieSlowo);
  }
}
