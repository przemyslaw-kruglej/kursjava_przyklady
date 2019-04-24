public class StringSplit {
    public static void main(String[] args) {
        String tekst = "Ala ma kota";

        // podziel tekst - jako separator uzyj spacji
        String[] slowa = tekst.split(" ");

        for (int i = 0; i < slowa.length; i++) {
            System.out.println("Slowo nr " + (i + 1) + " to: " + slowa[i]);
        }


        String zwierzetaPoPrzecinku = "kot,pies,,chomik";

        // podziel tekst - jako separator uzyj przecinka
        String[] zwierzeta = zwierzetaPoPrzecinku.split(",");

        for (int i = 0; i < zwierzeta.length; i++) {
            System.out.println("Zwierze nr " + (i + 1) + " to: " + zwierzeta[i]);
        }
    }
}
