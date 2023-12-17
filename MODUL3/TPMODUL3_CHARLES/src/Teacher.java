public class Teacher extends User{
    public Teacher(String Name, int Id){
        super(Name, Id);
    }

    public void teachClass(String course){
       System.out.println("\n"+ "Pak" + Name + " is teaching " + course);
    }

    @Override
    public String getUserDetails() {
        return super.getUserDetails();
    }
}
