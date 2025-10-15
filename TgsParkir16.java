import java.util.Scanner;

public class TgsParkir16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPembayaran = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (mobil/motor, 0 untuk selesai): ");
            String jenis = sc.next();

            if (jenis.equals("0")) break;

            System.out.print("Masukkan durasi parkir (jam): ");
            int jam = sc.nextInt();

            int tarif;
            if (jam > 5)
                tarif = 12500;
            else if (jenis.equalsIgnoreCase("mobil"))
                tarif = jam * 3000;
            else if (jenis.equalsIgnoreCase("motor"))
                tarif = jam * 2000;
            else {
                System.out.println("Jenis kendaraan tidak dikenal!");
                continue;
            }

            System.out.println("Total bayar: Rp " + tarif);
            totalPembayaran += tarif;
        }

        System.out.println("\nTotal seluruh pembayaran parkir hari ini: Rp " + totalPembayaran);
        sc.close();
    }
}
