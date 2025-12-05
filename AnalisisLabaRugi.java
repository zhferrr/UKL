import java.util.Scanner;

public class AnalisisLabaRugi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah paket photobooth: ");
        int jumlahPaket = input.nextInt();
        input.nextLine(); // Bersihkan buffer

        String[] namaPaket = new String[jumlahPaket];
        double[] biayaProduksi = new double[jumlahPaket];
        double[] hargaJual = new double[jumlahPaket];
        int[] jumlahEvent = new int[jumlahPaket];

        double totalKeseluruhan = 0;
        double labaTertinggi = Double.NEGATIVE_INFINITY;
        String paketLabaTertinggi = "";

        // Input data tiap paket
        for (int i = 0; i < jumlahPaket; i++) {
            System.out.print("Nama paket: ");
            namaPaket[i] = input.nextLine();

            System.out.print("Biaya produksi per event: ");
            biayaProduksi[i] = input.nextDouble();

            System.out.print("Harga jual per event: ");
            hargaJual[i] = input.nextDouble();

            System.out.print("Jumlah event terjual: ");
            jumlahEvent[i] = input.nextInt();
            input.nextLine(); // Bersihkan buffer
        }

        // Header tabel
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Nama Paket | Total Biaya | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("---------------------------------------------------------------------------");

        // Hitung dan tampilkan tiap paket
        for (int i = 0; i < jumlahPaket; i++) {
            double totalBiaya = biayaProduksi[i] * jumlahEvent[i];
            double totalPendapatan = hargaJual[i] * jumlahEvent[i];
            double labaRugi = totalPendapatan - totalBiaya;

            String status;
            if (labaRugi > 0) {
                status = "Laba";
            } else if (labaRugi < 0) {
                status = "Rugi";
            } else {
                status = "Impas";
            }

            System.out.printf("%-8s | Rp%,10.0f | Rp%,13.0f | Rp%,10.0f | %s\n",
                    namaPaket[i], totalBiaya, totalPendapatan, labaRugi, status);

            totalKeseluruhan += labaRugi;

            if (labaRugi > labaTertinggi) {
                labaTertinggi = labaRugi;
                paketLabaTertinggi = namaPaket[i];
                labaRugi = labaTertinggi;
            }
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("Total Laba/Rugi Keseluruhan: Rp%,.0f\n", totalKeseluruhan);
        System.out.printf("Paket dengan Laba Tertinggi: %s (Rp%,.0f)\n", paketLabaTertinggi, labaTertinggi);
        System.out.printf("paket dengan rugi terbesar: .0f", labaTertinggi);
    }
}