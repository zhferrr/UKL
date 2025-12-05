import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan angka awal: ");
        int start = input.nextInt();

        for (int i = start; i > 0; i--) {
            String pesan = "";

            if (i == 1) {
                // Kasus khusus untuk angka 1
                pesan = "saya senang";
            } else if (i % 3 == 0) {
                // Jika angka habis dibagi 3 (kelipatan 3)
                pesan = "saya angkatan 33";
            } else if (i % 2 != 0) {
                // Jika angka ganjil (dan bukan kelipatan 3)
                pesan = "saya anak wikusama";
            } else {
                // Jika angka genap (dan bukan kelipatan 3)
                pesan = "saya anak moklet";
            }

            // Mencetak nomor dan pesan yang sesuai
            System.out.println(i + ". " + pesan); 
        }
    }
}
