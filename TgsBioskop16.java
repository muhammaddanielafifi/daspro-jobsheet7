import java.util.Scanner;

public class TgsBioskop16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hargaTiket = 50000;
        int totalTiket = 0;
        double totalPendapatan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            int jumlah = sc.nextInt();

            if (jumlah == 0) break;

            if (jumlah < 0 || jumlah > 20) {
                System.out.println("Input tidak valid! (0–20 saja). Coba lagi.\n");
                continue;
            }

            double totalHarga = jumlah * hargaTiket;
            double diskon = 0;

            if (jumlah > 10) {
                diskon = 0.15;
            } else if (jumlah > 4) {
                diskon = 0.10;
            }

            double hargaSetelahDiskon = totalHarga - (totalHarga * diskon);

            System.out.println("Harga normal: Rp " + totalHarga);
            if (diskon > 0)
                System.out.println("Diskon " + (int)(diskon * 100) + "% diterapkan!");
            System.out.println("Total harga yang harus dibayar: Rp " + hargaSetelahDiskon + "\n");

            totalTiket += jumlah;
            totalPendapatan += hargaSetelahDiskon;
        }

        System.out.println("==============================");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan hari ini: Rp " + totalPendapatan);
        System.out.println("==============================");

        sc.close();
    }
}

