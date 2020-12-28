class AngkaBerurutanUAS {
  public static void main(String[] args) {
  int[] deretAngka = {4,2,3,3,2,4,6,7,3,9};
      System.out.println(ujian(deretAngka));
    }
  public static int ujian(int[] deretAngka) {

  int count =1, max =1;
    for (int x = 1; x < deretAngka.length; x++) {
    if (deretAngka[x] > deretAngka[x - 1]) {
        count++;
    } else {
      count = 1;
    }
    if (count >= max) {
      max = count;
    }
    }
      return max;
    }
}