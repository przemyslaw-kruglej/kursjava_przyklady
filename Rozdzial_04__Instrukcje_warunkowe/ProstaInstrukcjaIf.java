public class ProstaInstrukcjaIf {
  public static void main(String[] args) {
    int x = 5;

    if (x > 0) {
      System.out.println("x jest wieksze od 0.");
    } else if (x < 0) {
      System.out.println("x jest mniejsze od 0.");
    } else {
      System.out.println("x jest rowne 0.");
    }
  }
}