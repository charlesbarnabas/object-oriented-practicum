import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // TO DO : Create a Scanner object to receive input from the user
        Scanner input = new Scanner(System.in);

        // TO DO : Create Bioskop and Cashier objects
        User user = new User();
        Bioskop bioskop = new Bioskop();
        Cashier cashier = new Cashier();

        // TO DO : Take the name from the user, make sure it is not empty
        System.out.println("=====Silahkan Register=====");
        while (true) {
            
            System.out.print("Masukkan nama: ");
            String namaUser = input.nextLine();
            user.setName(namaUser);
            if(!namaUser.isEmpty()){
                break;
            }
            else{
                System.out.println("Masukkan nama Anda, Jangan Kosong!");
            }
        }

        // TO DO : Take the phone number from the user, make sure it is valid
        while (true) {
            System.out.print("Masukkan No Handphone: ");
            String noUser = input.nextLine();
            user.setNoHandPhone(noUser);
            if(noUser.length() == 13){
                System.out.println("No Handphone valid");
                break;
            }
            else{
                System.out.println("No Handphone tidak valid, silahkan masukkan ulang!");
            }
        }

        user.register();
        bioskop.displaySeating();

        // TO DO : Create a code for ticket order
        while (true) {
            try{
                System.out.println("\nApakah anda ingin memesan kursi? (y/n) : ");
                String pil = input.nextLine();

                if(pil.equals("y")){
                    System.out.println("Pilih baris kursi : ");
                    int baris = input.nextInt();
                    System.out.println("Pilih posisi kursi : ");
                    int posisi = input.nextInt();
                    input.nextLine();
                    
                    // TO DO : Call the method to reserve seats in the cinema
                    bioskop.bookSeat((baris -1), (posisi -1));
                    bioskop.displaySeating();
                }
                else{
                    cashier.printTicket(user);
                }
            }
            catch(NumberFormatException e){
                System.out.println("Input harus berupa angka");
            }
            
            

                
            }
            
        }
        
        // TO DO : Create a exception if user enter not number

        // TO DO : Create a exception if user enter number is out of range

        
        
        // TO DO : Close the Scanner object when the user is finished

}
