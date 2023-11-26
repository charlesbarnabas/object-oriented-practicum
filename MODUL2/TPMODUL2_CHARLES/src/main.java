public class main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("M1", 120.0, 5, 4);
        Bus bus1 = new Bus("B1", 80.0, 40, 30);

        double jarakPerjalanan = 300.0;
        System.out.println("Informasi Mobil:");
        System.out.println(mobil1);
        System.out.println("Waktu Tempuh dengan Mobil: " + mobil1.hitungWaktuTempuh(jarakPerjalanan) + " jam");
        System.out.println("\nInformasi Bus:");
        System.out.println(bus1);
        System.out.println("Waktu Tempuh dengan Bus: " + bus1.hitungWaktuTempuh(jarakPerjalanan) + " jam");
    }
}
