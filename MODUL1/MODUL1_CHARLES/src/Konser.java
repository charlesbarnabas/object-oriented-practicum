public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String BandName;
    private String Date;
    private String Location;
    private Double TicketPrice;

    //set get bandname
    public void setBandName (String BandName){
        this.BandName = BandName;
    }

    public String getBandName(){
        return BandName;
    }

    //set get date
    public void setDate (String Date){
        this.Date = Date;
    }

    public String getDate(){
        return Date;
    }

    //set get location
    public void setLocation (String Location){
        this.Location = Location;
    }

    public String getLocation(){
        return Location;
    }

    //set get ticket price
    public void setTicketPrice (Double TicketPrice){
        this.TicketPrice = TicketPrice;
    }

    public Double getTicketPrice(){
        return TicketPrice;
    }

}