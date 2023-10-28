import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Database {
    
    // TODO: Create List of Konser Object to Store Konser from Konser Class
    Konser konser = new Konser();
    private ArrayList<Konser> konserlist =new ArrayList<>();

    // TODO: Create Method to insert Konser to Database
    public void InsertKonser (Konser konser){
        konserlist.add(konser);
    }

    // TODO: Create Method to Show Konser from Database
    public void showKonser(){
        System.out.println("Daftar Acara Konser yang tersedia\n");
        int number = 1;
        for (Konser konser : konserlist){
            System.out.println(number +"."+ konser.getBandName());
            System.out.println("Tanggal Konser: " +konser.getDate());
            System.out.println("Lokasi: " + konser.getLocation());
            System.out.println("Harga Tiket: \n" + konser.getTicketPrice());
            number ++;
        }
    }

    // TODO: Create Method to Buy Ticket and Show the Total Price
    public void BuyTicket(){
        Scanner inputtiketkonser = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Pilih Nomor Konser yang : ");
        int jawabantiket = inputtiketkonser.nextInt();

        if (jawabantiket == 1){
            Scanner inputjumlahtiket1 = new Scanner(System.in);
            System.out.println("Jumlah Tiket yang akan dibeli: ");
            int jumlahtiket = inputjumlahtiket.nextInt();
            System.out.println("Selamat anda berhasil membeli tiket konser "+ konser.getBandName());
            System.out.println("Jumlah Tiket yang dibeli " + jumlahtiket);
            System.out.println("Total Harga: " +konser.getTicketPrice() * jumlahtiket);
        elif (jawabantiket == 2){
            Scanner inputjumlahtiket2 = new Scanner(System.in);
            System.out.println("Jumlah Tiket yang akan dibeli: ");
            int jumlahtiket = inputjumlahtiket.nextInt();
            System.out.println("Selamat anda berhasil membeli tiket konser "+ konser.getBandName());
            System.out.println("Jumlah Tiket yang dibeli " + jumlahtiket);
            System.out.println("Total Harga: " +konser.getTicketPrice() * jumlahtiket);

        }   
        
    }
}
