public class CharAtILengthPrzyklad {
  public static void main(String[] args) {
    String tekst = "Ala ma kota";

    for (int i = 0; i < tekst.length(); i++) {
      System.out.print(tekst.charAt(i) + " ");
    }
  }
}
