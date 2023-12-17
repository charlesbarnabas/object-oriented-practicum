public class User {
    protected String Name;
    protected int Id;
    
    public User(String Name,int Id){
        this.Name = Name;
        this.Id = Id;
    }

    public String getUserDetails(){
        return "Name: " + Name + ", ID: " + Id;
    }

}
