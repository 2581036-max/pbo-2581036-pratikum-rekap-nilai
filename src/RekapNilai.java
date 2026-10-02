import java.util.Scanner;

public class RekapNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SELESAI = -1;
        int jumlah = 0;
        double total = 0;
        int nilai = 0;

        do {
            System.out.print("Nilai ke-" + (jumlah + 1) + " : ");
            nilai = sc.nextInt();

            if (nilai == SELESAI) {
                break;
            }

            total += nilai;
            jumlah++;

        } while (true);

        sc.close();
    }
}