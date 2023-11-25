public class main {
    public static void main(String[] args) {
        System.out.println("Informasi Mobil:");
        Mobil mobil1 = new Mobil("M1", 120.0, 5, 4);
        System.out.println(mobil1);
        double jarakMobil = 300.0;
        System.out.println("Waktu Tempuh dengan Mobil: " + mobil1.hitungWaktuTempuh(jarakMobil) + " jam");

        System.out.println("\nInformasi Bus:");
        Bus bus1 = new Bus("B1", 80.0, 40, 30);
        System.out.println(bus1);
        double jarakBus = 300.0;
        System.out.println("Waktu Tempuh dengan Bus: " + bus1.hitungWaktuTempuh(jarakBus) + " jam");
    }
}
