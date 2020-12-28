import java.util.*;
class Main {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int qwerty = input.nextInt();
  int jumlah[] = new int[qwerty];
  
  for (int x = 0; x < jumlah.length; x++) {
    jumlah[x] = input.nextInt();
  }
  for (int y = qwerty - 1; y >= 0; y--) {
    System.out.println(jumlah[y]);
  }
  }
  }