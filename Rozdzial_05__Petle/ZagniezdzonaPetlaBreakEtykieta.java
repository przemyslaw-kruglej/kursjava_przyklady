public class ZagniezdzonaPetlaBreakEtykieta {
  public static void main(String[] args) {
    glowna_petla: for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(j + ", ");

        if (j == 1) break glowna_petla;
      }
    }
  }
}
