import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int xx = input.nextInt();
        System.out.print ( xx );
        String[] yy = {
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
            System.out.print (" " + yy [ urutanBulan - 0 ] + " " );
        } else if ( urutanBulan < 0 ) {
            System.out.print ("Nomor tidak valid");
        } else {
            System.out.print ("Nomor tidak valid");
        }
        int zzzz = input.nextInt();
        System.out.print ( zzzz );
    }
}