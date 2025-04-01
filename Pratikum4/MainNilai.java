import java.util.ArrayList;
import java.util.Scanner;

public class MainNilai {
    private static ArrayList<Nilai> daftarNilai = new ArrayList<>();

    public static void tambahNilai(int nilai) {
        daftarNilai.add(new Nilai(nilai));
    }

    public static void daftarNilai() {
        System.out.println("\nDaftar Nilai:");
        for (Nilai n : daftarNilai) {
            n.tampilkan();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai: ");
        int jumlah = scanner.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            int nilai = scanner.nextInt();
            tambahNilai(nilai);  
        }

        daftarNilai();  
        scanner.close();
    }
}
