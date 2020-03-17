public class StackUzycie {
  public static void main(String[] args) {
    try {
      Stack s = new Stack(-1);
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      Stack s = new Stack(0);
      s.push(1);
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      Stack s = new Stack(1);
      s.push(1);
      System.out.println("Rozmiar: " + s.size());
      System.out.println("Top: " + s.top());
      System.out.println("Wartosc: " + s.pop());
      System.out.println("Rozmiar: " + s.size());
      System.out.println("Top: " + s.top());
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      Stack s = new Stack(3);
      s.push(5);
      s.push(10);
      s.push(15);
      s.clear();
      s.push(20);
      System.out.println("Wartosc: " + s.pop());
      System.out.println("Top: " + s.top());
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      Stack s = new Stack(5);
      s.push(10);
      s.push(200);
      s.push(3000);
      s.push(40000);
      s.push(500000);
      System.out.println("Rozmiar: " + s.size());
      System.out.println("Top: " + s.top());
      System.out.println("Wartosc: " + s.pop());
      System.out.println("Top: " + s.top());
      s.push(5);
      System.out.println("Wartosc: " + s.pop());
      System.out.println("Wartosc: " + s.pop());
      System.out.println("Wartosc: " + s.pop());
      System.out.println("Top: " + s.top());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
