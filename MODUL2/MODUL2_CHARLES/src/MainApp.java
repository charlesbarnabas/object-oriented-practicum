public class MainApp {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi1 = new Ekspedisi(10, "Jakarta", 10000);
        ekspedisi1.informasi();

        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress teluexpress1 = new TelUExpress(100, "Bandung", 50000, true);
        teluexpress1.informasi();
        teluexpress1.ambil("Sukabirus");
        teluexpress1.antar(1628389);
        teluexpress1.antar(1922722, 7628262);

        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress friexpress1 = new FRIExpress(30, "Bojongsoang", 70000, false);
        friexpress1.informasi();
        friexpress1.terima(2000);
        friexpress1.kirim("Lembang");
        friexpress1.kirim("Braga", "Rancaekek");
    }
}
