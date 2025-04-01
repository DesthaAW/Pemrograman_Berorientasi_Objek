import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nilai1 = new ArrayList<>();
        ArrayList<Integer> nilai2 = new ArrayList<>();
        ArrayList<Integer> jumlah = new ArrayList<>();
        ArrayList<Integer> kurang = new ArrayList<>();
        ArrayList<Integer> kali = new ArrayList<>();
        ArrayList<Double> bagi = new ArrayList<>();

        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();

        System.out.println("Masukkan nilai untuk ArrayList 1:");
        for (int i = 0; i < n; i++) {
            nilai1.add(scanner.nextInt());
        }

        System.out.println("Masukkan nilai untuk ArrayList 2:");
        for (int i = 0; i < n; i++) {
            nilai2.add(scanner.nextInt());
        }

        for (int i = 0; i < n; i++) {
            jumlah.add(nilai1.get(i) + nilai2.get(i));
            kurang.add(nilai1.get(i) - nilai2.get(i));
            kali.add(nilai1.get(i) * nilai2.get(i));
            bagi.add(nilai2.get(i) != 0 ? (double) nilai1.get(i) / nilai2.get(i) : 0);
        }

        System.out.println("\nHasil Perhitungan:");
        for (int i = 0; i < n; i++) {
            System.out.println("Index " + i + " -> Jumlah: " + jumlah.get(i) +
                    ", Kurang: " + kurang.get(i) +
                    ", Kali: " + kali.get(i) +
                    ", Bagi: " + bagi.get(i));
        }
    }
}