import java.util.Scanner;

public class FibonacciGanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah elemen
        System.out.print("Masukkan jumlah elemen Fibonacci: ");
        int n = scanner.nextInt();

        // Variabel untuk deret Fibonacci
        int a = 0;
        int b = 1;

        // Variabel untuk menghitung ganjil dan genap
        int countGanjil = 0;
        int countGenap = 0;

        System.out.println("Deret Fibonacci:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            // Menghitung ganjil dan genap
            if (a % 2 == 0) {
                countGenap++;
            } else {
                countGanjil++;
            }

            // Men-generate angka Fibonacci berikutnya
            int next = a + b;
            a = b;
            b = next;
        }

        // Menampilkan jumlah bilangan ganjil dan genap
        System.out.println("\nJumlah bilangan genap: " + countGenap);
        System.out.println("Jumlah bilangan ganjil: " + countGanjil);
    }
}
