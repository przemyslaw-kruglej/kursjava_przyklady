public class InstrukcjeInicjalizujacePetlaFor {
  public static void main(String[] args) {
    for (int j = 1, k = 1; j < 100 && k < 100; j = j * 2, k = k * 3) {
      System.out.println("j = " + j + ", k = " + k);
    }
  }
}