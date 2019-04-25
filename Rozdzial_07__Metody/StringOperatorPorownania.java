import java.util.Scanner;

public class StringOperatorPorownania {
    public static void main(String[] args) {
        System.out.print("Podaj slowo: ");

        String slowo = getString();

        if (slowo == "kot") {
            System.out.println("Wpisales slowo kot.");
        } else {
            System.out.println("Wpisales slowo inne niz kot.");
        }
    }

    public static String getString() {
        return new Scanner(System.in).next();
    }
}
