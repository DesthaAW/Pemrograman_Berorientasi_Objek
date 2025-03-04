public class Segitiga {
    public static void main(String[] args) {
        // Deklarasi nilai alas, tinggi, dan sisi segitiga secara langsung
        double alas = 10;
        double tinggi = 8;
        double sisiMiring = 12;

        // Menghitung luas segitiga
        double luas = 0.5 * alas * tinggi;

        // Menghitung keliling segitiga
        double keliling = alas + tinggi + sisiMiring;

        // Menampilkan hasil
        System.out.println("=== HASIL PERHITUNGAN SEGITIGA ===");
        System.out.println("Alas Segitiga     : " + alas);
        System.out.println("Tinggi Segitiga   : " + tinggi);
        System.out.println("Sisi Miring       : " + sisiMiring);
        System.out.println("Luas Segitiga     : " + luas);
        System.out.println("Keliling Segitiga : " + keliling);
    }
}