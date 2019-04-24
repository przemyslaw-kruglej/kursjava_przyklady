public class WhileILiczbyOd1Do10 {
  public static void main(String[] args) {
    int i = 1;

    while (i <= 10) {
      if (i != 10) {
        System.out.print(i++ + ", ");
      } else {
        System.out.print(i++);
      }
    }
  }
}
