import java.util.Scanner;

public class TagihanListrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama pelanggan: ");
        String nama = scanner.nextLine();

        System.out.print("Golongan listrik (A, B, C): ");
        char gol = scanner.next().toUpperCase().charAt(0);

        System.out.print("Pemakaian listrik (kWh): ");
        int pemakaian = scanner.nextInt();

        // Menentukan tarif per kWh
        int tarif = 0;
        if (gol == 'A') tarif = 1200;
        else if (gol == 'B') tarif = 1500;
        else if (gol == 'C') tarif = 1800;
        else {
            System.out.println("Golongan tidak valid!");
            return;
        }

        // Hitung tagihan
        double totalAwal = pemakaian * tarif;
        double totalAkhir = pemakaian > 500 ? totalAwal * 1.1 : totalAwal;

        // Tampilkan hasil dengan format angka desimal & ribuan
        System.out.println("\n===== Rincian Tagihan Listrik =====");
        System.out.println("Nama pelanggan      : " + nama);
        System.out.println("Golongan listrik    : " + gol);
        System.out.println("Pemakaian listrik   : " + pemakaian + " kWh");
        System.out.println("Total tagihan awal  : Rp " + String.format("%,.2f", totalAwal));

        if (pemakaian > 500) {
            System.out.println("Biaya tambahan 10% : Rp " + String.format("%,.2f", totalAkhir - totalAwal));
        }

        System.out.println("Total tagihan akhir : Rp " + String.format("%,.2f", totalAkhir));
    }
}