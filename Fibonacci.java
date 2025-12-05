import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = scanner.nextInt();
        
        int a = 0, b = 1;
        int ganjil = 0, genap = 0;

         for (int i = 0; i < n; i++) {
         System.out.print(a + " ");
         if (a % 2 == 0) genap++; else ganjil++;

          int next = a + b;
          a = b;
         b = next;
        }
         System.out.println(); // pindah baris
         System.out.println("Jumlah genap: " + genap);
         System.out.println("Jumlah ganjil: " + ganjil);

        
        scanner.close();
    }
}