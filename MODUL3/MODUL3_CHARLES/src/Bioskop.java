public class Bioskop {
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private int ROWS = 5;

    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private int SEATS_PER_ROWS = 10;

    // TO DO: Create 2 dimensional array to store seat reservation status
    protected int[][] seats = new int[ROWS][SEATS_PER_ROWS];

    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
       seats[2][1] = 1;
       seats[1][2] = 1;
       seats[3][4] = 1;
       
    }

    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        System.out.println("Booking Tiket Bioskop: ");
        for(int i = 0; i < ROWS ; i++){
            System.out.println("");
            for(int j = 0; j < SEATS_PER_ROWS ; j++){
                System.out.print(seats[i][j]+ " ");
            }
        }
    }

    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if(seats[row][seat] == 0){
            seats[row][seat] = 1;
            System.out.println("Kursi Berhasil dipesan " +row+ "," +seat);
        }
        else{
            System.out.println("Kursi"+row+","+seat+"sudah dipesan!");
        }
    }
}