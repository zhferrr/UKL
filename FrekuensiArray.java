import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrekuensiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Input elemen array
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Membuat map untuk menyimpan frekuensi
        Map<Integer, Integer> frekuensiMap = new HashMap<>();

        // Menghitung frekuensi
        for (int angka : array) {
            frekuensiMap.put(angka, frekuensiMap.getOrDefault(angka, 0) + 1);
        }

        // Menampilkan hasil
        for (Map.Entry<Integer, Integer> entry : frekuensiMap.entrySet()) {
            System.out.println(entry.getKey() + " muncul " + entry.getValue() + " kali");
        }

        // Mencari nilai dengan frekuensi terbesar
        int nilaiTerbanyak = 0;
        int frekuensiTerbesar = 0;
    }
}
