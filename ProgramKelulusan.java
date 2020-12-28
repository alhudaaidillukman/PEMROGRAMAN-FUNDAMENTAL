import java.util.*;
class ProgramKelulusan {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int nilai = input.nextInt();
    
    if (nilai >= 55) {
      System.out.println("Selamat! Anda lulus dengan nilai " + nilai);
      System.out.println("Program selesai");
    } else {
      System.out.println("Program selesai");
    }
  }
}