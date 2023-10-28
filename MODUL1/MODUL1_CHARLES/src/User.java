import java.util.Scanner;

public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    private String Name;
    private String PhoneNumber;

    public void setName (String Name){
        this.Name = Name;
    }

    public void setPhoneNumber (String PhoneNumber){
        this.PhoneNumber = PhoneNumber;
    }

    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    public void RegisterandDisplayuser(){
        System.out.println("Register Berhasil");
        System.out.println("Nama: " + Name);
        System.out.println("No Handphone "+ PhoneNumber);
    }
}
