import java.util.*;
class MenghitungJumlahPerbaris {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  int matriks[][] = new int[5][5];
  
  for (int baris = 0; baris < 5; baris++){
    for (int kolom = 0; kolom < 5; kolom++){
      matriks [baris] [kolom] = input.nextInt();
    }
  }
  int qwerty = 0;
  for (int baris = 0; baris < 5; baris++){
    for (int kolom = 0; kolom < 5; kolom++){
      qwerty += matriks [baris] [kolom];
    }
  System.out.println(qwerty);
  qwerty = 0;
  }
  }
}