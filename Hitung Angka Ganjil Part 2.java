import java.util.*;

class Main {
  public static void main(String[] args) {
  int kolom, baris, ganjil = 0;
  Scanner input = new Scanner(System.in);
  baris = input.nextInt();
  kolom = input.nextInt();
        int nilai[][] = new int[baris][kolom];
        for (int a = 0; a < baris; a++)
        {
        for (int b = 0; b < kolom; b++)
        {
        nilai[a][b] = input.nextInt();
          }
        }
        for(int x = 0; x < baris; x++){
        ganjil = 0;
        for(int y = 0; y < kolom; y++){
        if(nilai[x][y] % 2 != 0) {
        ganjil++ ;
          }
        }
            System.out.println(ganjil);
        }
  }
}