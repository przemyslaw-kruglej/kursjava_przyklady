public class WypiszLiczbyOd1Do5ForZakresZmiennej {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }

    // powoduje blad kompilacji! kompilator nie wie
    // w tym miejscu, czym jest zmienna i
    System.out.println("Po ukonczeniu petli i = " + i);
  }
}