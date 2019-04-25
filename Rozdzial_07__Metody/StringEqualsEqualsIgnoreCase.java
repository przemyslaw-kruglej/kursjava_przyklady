import java.util.Scanner;

public class StringEqualsEqualsIgnoreCase {
    public static void main(String[] args) {
        System.out.print("Podaj slowo: ");

        String slowo = getString();

        if (slowo.equals("kot")) {
            System.out.println("Podane slowo to kot.");
        } else {
            System.out.println("Podano slowo inne niz kot");
        }

        if (slowo.equalsIgnoreCase("Kot")) {
            System.out.println("Podane slowo (bez uwzglednienia wielkosci znakow) to kot.");
        } else {
            System.out.println("Podano slowo inne niz kot (nawet po nie braniu pod uwage wielkosci znakow).");
        }
    }

    public static String getString() {
        return new Scanner(System.in).next();
    }
}
