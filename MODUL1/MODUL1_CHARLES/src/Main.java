import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // TODO: Create Database Object
        Database database = new Database();

        // TODO: Create Konser Object and Set the Attributes
        Konser konser1 = new Konser();
        konser1.setBandName("Noah");
        konser1.setDate("15-11-2023");
        konser1.setLocation("Sukabirus");
        konser1.setTicketPrice(50000.0);

        Konser konser2 = new Konser();
        konser2.setBandName("Sheila on 7");
        konser2.setDate("16-11-2023");
        konser2.setLocation("Sukapura");
        konser2.setTicketPrice(70000.0);

        
        // TODO: Insert Konser Object to Database
        database.InsertKonser(konser1);
        database.InsertKonser(konser2);

        // TODO: Display Greeting Message and Prompt User to Register
        System.out.println("Selamat Datang di Konser EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("==============================");

        // TODO: Create a User Object and Set the Attributes
        User userobject = new User();
        Scanner inputuser = new Scanner(System.in);
        System.out.println("Nama: ");
        userobject.setName(inputuser.nextLine());
        System.out.println("No Handphone: ");
        userobject.setPhoneNumber(inputuser.nextLine());
        System.out.println("==============================");
        userobject.RegisterandDisplayuser();
        System.out.println("==============================");
        
        // TODO: Display Main Menu and Prompt User to Choose Menu
        System.out.println("1. Lihat Konser");
        System.out.println("2. Beli Tiket");
        System.out.println("3. Keluar");
        System.out.println("==============================");
        System.out.println("Silahkan pilih menu: ");
        Scanner inputjawaban = new Scanner (System.in);
        int choice = inputjawaban.nextInt();

        switch (choice){
            case (1):
                database.showKonser();
                break;
            case (2):
                database.BuyTicket();
                break;
            case (3):
                System.out.println("Terimakasih");
                break;
        }
    }
}
