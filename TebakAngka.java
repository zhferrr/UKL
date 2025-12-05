import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class TebakAngka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int angkaRandom = random.nextInt(100) + 1; // Angka antara 1-100
        ArrayList<Integer> tebakanList = new ArrayList<>();
        int tebakan = 0;

        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Tebak angka antara 1 sampai 100.");

        // Loop sampai benar
        while (true) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = scanner.nextInt();
            tebakanList.add(tebakan);

            if (tebakan > angkaRandom) {
                System.out.println("Tebakan terlalu tinggi!");
            } else if (tebakan < angkaRandom) {
                System.out.println("Tebakan terlalu rendah!");
            } else {
                System.out.println("Anda menebak dengan benar!");
                break; // keluar dari while
            }
        } 
        // Menampilkan semua tebakan
        System.out.println("\nTebakan Anda selama permainan: " + tebakanList);
    }
}
