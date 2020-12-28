import java.util.*;
class GarisPersegi {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int qwerty = input.nextInt();
  for (int i = 0; i <= qwerty; i++) {
  for (int j = 0; j <= qwerty; j++) {
  if (i == 0 || i== qwerty || j == 0 || j == qwerty){
      System.out.print("#");
    }
    else
    {
      System.out.print(" ");
  }
  }
      System.out.println("");
}
}
}