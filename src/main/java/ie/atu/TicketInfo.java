package ie.atu;

public class TicketInfo {

    //  classes
    UserInfo user_info = new UserInfo();
    TicketAvailability ticket_avail = new TicketAvailability(70, 30);
    Payment ticket_pay = new Payment();


    public TicketInfo(){

    }

    @Override
    public String toString() {
        return "TicketInfo{" +
                "user_info=" + user_info +
                ", ticket_avail=" + ticket_avail +
                ", ticket_pay=" + ticket_pay +
                '}';
    }
}
