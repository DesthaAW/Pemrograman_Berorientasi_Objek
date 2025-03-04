public class Lingkaran {

    public static void main(String[] args) {
        int jariJari = 14; 
        double phi = 3.14; 

        double luas = phi * jariJari * jariJari;
        double keliling = 2 * phi * jariJari;

        System.out.println("=== HASIL PERHITUNGAN Lingkaran ===");
        System.out.println("Jari Jari: " + jariJari);
        System.out.println("Phi: " + phi);
        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}