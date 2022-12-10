package ie.atu;

public class TicketInfo {

    //  classes
    UserInfo user_info = new UserInfo();
    TicketAvailability ticket_avail = new TicketAvailability(1, 1);

    ParkingAvailability ticket_Parking = new ParkingAvailability(2);
    Payment ticket_pay = new Payment();


    public TicketInfo(){
    }

    public TicketInfo(String name, String occupation, int age, int seat, int stand, String parking, long card_number, String card_date, int card_ccv){
        this.user_info.setUsr_name(name);
        this.user_info.setUsr_occupation(occupation);
        this.user_info.setUsr_age(age);

        this.ticket_avail.setUser_seat(seat);
        this.ticket_avail.setUser_standing(stand);

        this.ticket_Parking.setParking_Option(parking);

        this.ticket_pay.setCardNumber(card_number);
        this.ticket_pay.setCardDate(card_date);
        this.ticket_pay.setCardCCV(card_ccv);

    }

    @Override
    public String toString() {
        return "TicketInfo{" +
                "user_info=" + user_info +
                ", ticket_avail=" + ticket_avail +
                ", ticket_pay=" + ticket_pay +
                ", ticket_Parking" + ticket_Parking +
                '}';
    }
}
