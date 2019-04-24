public class LiczbaLong {
  public static void main(String[] args) {
    long wielkaLiczba;

    // linia zakomentowana, poniewaz spowodowalaby blad kompilacji!
    // liczba 10000000000 jest za duza na typ int,
    // ktory jest domyslnym typem literalow liczb calkowitych
    // wielkaLiczba = 10000000000;

    // ponizsza linia nie sprawia problemow, poniewaz dopisalismy
    // na koncu liczby litere L, sygnalizujac kompilatorowi,
    // ze chcemy umiescic w kodzie duza liczbe - wykraczajac poza zakres typu int
    wielkaLiczba = 10000000000L;
  }
}