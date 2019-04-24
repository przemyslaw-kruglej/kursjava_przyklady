public class PrzykladBreakFor {
  public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) {
      System.out.println(i);

      if (i >= 3) {
        break;
      }

      System.out.println("Nadal dzialam.");
    }
  }
}
