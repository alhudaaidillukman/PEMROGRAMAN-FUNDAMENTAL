import java.util.*;
class AngkaRibuan {
  public static void main(String[] args) {
    Locale bahasa = new Locale("id");
    Scanner input = new Scanner(System.in);
    int angka = input.nextInt();
    
    System.out.printf(bahasa, "Rp%,d,-\n", angka);
    
  }
}