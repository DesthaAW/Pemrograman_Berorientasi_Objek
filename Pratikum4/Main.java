import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah Data: ");
        int jumlah = scanner.nextInt();

        Array1 array = new Array1(jumlah);
        array.inputData();
        array.tampilkanData();

        scanner.close(); 
    }
}
