public class MetodaZwracajacaOstatniZnak {
  public static void main(String[] args) {
    System.out.println(zwrocOstatniZnak("Witaj!"));
    System.out.println(zwrocOstatniZnak("Ala ma kota"));
    System.out.println(zwrocOstatniZnak("?"));
  }

  public static char zwrocOstatniZnak(String s) {
    return s.charAt(s.length() - 1);
  }
}