import java.util.Scanner;

public class Matriks { 
    private int[][] matriksA, matriksB, hasil;
    private int barisA, kolomA, barisB, kolomB;

    public Matriks(int barisA, int kolomA, int barisB, int kolomB) {
        this.barisA = barisA;
        this.kolomA = kolomA;
        this.barisB = barisB;
        this.kolomB = kolomB;
        matriksA = new int[barisA][kolomA];
        matriksB = new int[barisB][kolomB];
    }

    public void inputMatriks(Scanner scanner) {
        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < barisA; i++)
            for (int j = 0; j < kolomA; j++)
                matriksA[i][j] = scanner.nextInt();

        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < barisB; i++)
            for (int j = 0; j < kolomB; j++)
                matriksB[i][j] = scanner.nextInt();
    }

    public void tambahMatriks() {
        if (barisA != barisB || kolomA != kolomB) {
            System.out.println("Matriks A dan B harus memiliki ukuran yang sama untuk penjumlahan.");
            return;
        }

        hasil = new int[barisA][kolomA];
        for (int i = 0; i < barisA; i++)
            for (int j = 0; j < kolomA; j++)
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
    }

    public void kurangMatriks() {
        if (barisA != barisB || kolomA != kolomB) {
            System.out.println("Matriks A dan B harus memiliki ukuran yang sama untuk pengurangan.");
            return;
        }

        hasil = new int[barisA][kolomA];
        for (int i = 0; i < barisA; i++)
            for (int j = 0; j < kolomA; j++)
                hasil[i][j] = matriksA[i][j] - matriksB[i][j];
    }

    public void kaliMatriks() {
        if (kolomA != barisB) {
            System.out.println("Jumlah kolom matriks A harus sama dengan jumlah baris matriks B untuk perkalian.");
            return;
        }

        hasil = new int[barisA][kolomB];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                for (int k = 0; k < kolomA; k++) {
                    hasil[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }
    }

    public void tampilkanHasil(String operasi) {
        System.out.println("\nHasil " + operasi + ":");
        for (int[] row : hasil) {
            for (int elem : row)
                System.out.print(elem + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan jumlah baris matriks A: ");
        int barisA = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks A: ");
        int kolomA = scanner.nextInt();

        System.out.print("Masukkan jumlah baris matriks B: ");
        int barisB = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks B: ");
        int kolomB = scanner.nextInt();

        Matriks matriks = new Matriks(barisA, kolomA, barisB, kolomB);

        matriks.inputMatriks(scanner);

        System.out.println("\nPilih operasi: 1. Penjumlahan, 2. Pengurangan, 3. Perkalian");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                matriks.tambahMatriks();
                matriks.tampilkanHasil("Penjumlahan");
                break;
            case 2:
                matriks.kurangMatriks();
                matriks.tampilkanHasil("Pengurangan");
                break;
            case 3:
                matriks.kaliMatriks();
                matriks.tampilkanHasil("Perkalian");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
