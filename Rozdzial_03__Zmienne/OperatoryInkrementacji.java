public class OperatoryInkrementacji {
  public static void main(String[] args) {
    int x = 5;
    int y = 5;
    int a = x++;
    int b = ++y;

    System.out.println(x);
    System.out.println(a);

    System.out.println(y);
    System.out.println(b);
  }
}