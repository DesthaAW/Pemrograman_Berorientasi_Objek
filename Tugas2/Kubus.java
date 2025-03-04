public class Kubus {

    public static void main(String[] args) {
        int sisi = 10;

        int luasPermukaan = 6 * sisi * sisi;
        int volume = sisi * sisi * sisi;

        System.out.println("=== HASIL PERHITUNGAN Kubus ===");
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
        System.out.println("Volume Kubus: " + volume);
    }
}