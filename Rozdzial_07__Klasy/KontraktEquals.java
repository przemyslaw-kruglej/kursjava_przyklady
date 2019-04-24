public class KontraktEquals {
    public static void main(String[] args) {
        Osoba x = new Osoba("Jan", "Nowak", 30);
        Osoba y = new Osoba("Jan", "Nowak", 30);
        Osoba z = new Osoba("Jan", "Nowak", 30);
        Osoba a = new Osoba("Marek", "Kowalski", 35);

        // 1. zwrotnosc - obiekt jest rowny samemu sobie
        System.out.println("1. Czy obiekt x jest rowny sobie? " + x.equals(x));

        // 2. symetrycznosc - jesli x jest rowne y, to y jest rowne x
        System.out.println("2. Czy obiekt x jest rowny obiektowi y? " + x.equals(y));
        System.out.println("2. Czy obiekt y jest rowny obiektowi x? " + y.equals(x));

        // 3. przechodniosc - jesli x jest rowne y i y jest rowne z, to x jest rowne z
        System.out.println("3. Czy obiekt x jest rowny obiektowi y? " + x.equals(y));
        System.out.println("3. Czy obiekt y jest rowny obiektowi z? " + y.equals(z));
        System.out.println("3. Czy obiekt x jest rowny obiektowi z? " + x.equals(z));

        // 4. spojnosc - wynik equals nie zmienia sie, jezeli obiekty sie nie zmienia
        System.out.println("4. Czy obiekt x jest rowny obiektowi y? " + x.equals(y));
        System.out.println("4. Czy obiekt x jest rowny obiektowi a? " + x.equals(a));
        System.out.println("4. Czy obiekt x jest rowny obiektowi y? " + x.equals(y));
        System.out.println("4. Czy obiekt x jest rowny obiektowi a? " + x.equals(a));

        // 5. zaden obiekt nie jest rowny null
        System.out.println("5. Czy obiekt x jest rowny null? " + x.equals(null));
        System.out.println("5. Czy obiekt y jest rowny null? " + y.equals(null));
    }
}
