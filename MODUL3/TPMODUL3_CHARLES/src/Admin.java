public class Admin extends User {
    public Admin(String Name, int Id) {
        super(Name, Id);
    }

    public void manageSystem(String course) {
        System.out.println(Name + " is managing " + course);
    }

    @Override
    public String getUserDetails() {
        return super.getUserDetails();
    }
}
