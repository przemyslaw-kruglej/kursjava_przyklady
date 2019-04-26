public class Wspolrzedne {
    private int x, y;

    public Wspolrzedne(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Wspolrzedne w1 = new Wspolrzedne(10, 20);
        Wspolrzedne w2 = w1;
        Wspolrzedne w3 = new Wspolrzedne(1, -5);

        w3.setX(10);
        w3.setY(20);

        if (w1 == w2) {
            System.out.println("w1 jest rowne w2");
        } else {
            System.out.println("w1 nie jest rowne w2");
        }

        if (w1 == w3) {
            System.out.println("w1 jest rowne w3");
        } else {
            System.out.println("w1 nie jest rowne w3");
        }
    }
}
