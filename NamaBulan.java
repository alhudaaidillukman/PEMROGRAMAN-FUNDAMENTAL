import java.util.*;
class NamaBulan {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] namaBulan = {
        "Nomor tidak valid",
		"Januari",
        "Februari",
        "Maret",
        "April",
        "Mei",
        "Juni",
        "Juli",
        "Agustus",
        "September",
        "Oktober",
        "November",
        "Desember",
    };
int urutanBulan = input.nextInt();
if (urutanBulan <= 12) {
	System.out.println(namaBulan[urutanBulan-0]);
	} else if (urutanBulan < 0) {
	System.out.println("Nomor tidak valid");
	} else {
	System.out.println("Nomor tidak valid");
}
    
  }
}