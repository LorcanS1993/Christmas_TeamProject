package ie.atu;

public class ParkingAvailability {
    private static int NoOfParkSpaces = 100;
    private static int user_Parking = 0;
    private static int user_NotParking = 0;
    public static int max_Parking;
    private String Parking_Option;
    public ParkingAvailability(int max_Parking) {
        this.max_Parking = max_Parking;
        this.NoOfParkSpaces = max_Parking;
    }
    public int getUser_Parking(){return user_Parking;}
    public void setUser_Parking(int user_Parking){
        if(user_Parking <= 100){
            this.user_Parking = user_Parking;
        }
        else{
            throw new IllegalArgumentException("Over Parking capacity");
        }
    }
    public String getParking_Option() {
        return Parking_Option;
    }
    public void setParking_Option(String Parking_Option) {
        String buffer = Parking_Option;
        switch (buffer) {
            case "yes", "Yes", "YES" -> {
                this.Parking_Option = "Yes";
                if (++user_Parking > max_Parking) {
                    throw new IllegalArgumentException("No Parking AVAILABLE");
                }
            }
            case "no", "No", "NO" -> {
                this.Parking_Option = "No";
                if (++user_NotParking < max_Parking) {
                    throw new IllegalArgumentException("Parking Space Available");
                }
            }
            default -> throw new IllegalArgumentException("INCORRECT INPUT");
        }
    }
    public int getNoOfParkSpaces() {return NoOfParkSpaces;}
    public void setNoOfParkSpaces(int NoOfParkSpaces) {
        if (NoOfParkSpaces <= 100) {
            this.NoOfParkSpaces = NoOfParkSpaces;
        } else {
            throw new IllegalArgumentException("Parking lot is Full");
        }
    }
}

