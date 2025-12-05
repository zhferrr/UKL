import java.util.Scanner;

public class faktorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();
        long temp = 1; // Variabel untuk menyimpan hasil faktorial

        for (int i = 1; i <= bilangan; i++) {
            System.out.print(i + " X ");
            temp *= i;
        }
        System.out.println(" = " + temp);
    }
}