import java.util.Scanner;

class Array1 {
    private int[] data;

    public Array1(int jumlah) {
        data = new int[jumlah];
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            System.out.print("Data ke-" + (i + 1) + " = ");
            data[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public void tampilkanData() {
        System.out.println("\nHasil:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Hasil nilai[" + i + "]=" + data[i]);
        }
    }
}
