public class OperatoryWarunkowePriorytety {
  public static void main(String[] args) {
    int x = -5;
    int y = -10;
    int z = 20;

    if (x > 0 && y > 0 || z > 0) {
      System.out.println("Warunek spelniony.");
    } else {
      System.out.println("Warunek NIE jest spelniony.");
    }
  }
}
