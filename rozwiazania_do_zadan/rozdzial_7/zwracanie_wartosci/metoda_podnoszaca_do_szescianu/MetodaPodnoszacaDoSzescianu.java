public class MetodaPodnoszacaDoSzescianu {
  public static void main(String[] args) {
    System.out.println("0 do 3 potegi to " + szescian(0));
    System.out.println("1 do 3 potegi to " + szescian(1));
    System.out.println("3 do 3 potegi to " + szescian(3));
    System.out.println("10 do 3 potegi to " + szescian(10));
  }

  public static int szescian(int liczba) {
    return liczba * liczba * liczba;
  }
}