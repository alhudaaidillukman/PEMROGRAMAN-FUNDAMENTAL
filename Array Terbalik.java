import java.util.*;
class Main {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int qwerty[] = new int[5];
  for (int a = 0; a < qwerty.length; a++) {
    qwerty[a] = input.nextInt();
  }
  for (int a = 4; a >= 0; a--) {
    System.out.println(qwerty[a]);
  }
  }
  }
