public class Cashier extends Bioskop {
    // TO DO : Create a method to print ticket
    public void printTicket(User user) {
        for(int i = 0; i < super.seats.length ; i++){
            for(int j = 0; j < super.seats[i].length ; j++){
                System.out.println("Mencetak Tiket...");
                System.out.println("===========================");
                System.out.println("Nama    : " +user.getName());
                System.out.println("Phone   : " + user.getnoHandPhone());
                System.out.println("Seat    : " + i + "," + j );
                System.out.println("===========================");
                System.out.println("Selamat Menonton!");
            }
        }
        
    }

    
}

