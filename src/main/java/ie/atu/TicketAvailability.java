package ie.atu;

public class TicketAvailability {
    private int user_seat; // 70
    private int user_standing; //30
    private int stadium_size = 100;

    private String ticket_ref;

    public  TicketAvailability(){
    }

    public TicketAvailability(int max_user_seat, int max_user_standing) {
        this.user_seat = max_user_seat;
        this.user_standing = max_user_standing;
        this.stadium_size = max_user_seat + max_user_standing;
    }

    public int getUser_seat() {
        return user_seat;
    }

    public void setUser_seat(int user_seat) {

        if (user_seat <= 70) {
            this.user_seat = user_seat; }
        else {
            throw new IllegalArgumentException("Over seating capacity");
        }
    }

    public int getUser_standing() {
        return user_standing;
    }

    public void setUser_standing(int user_standing) {
        if (user_standing <= 30) {
            this.user_standing = user_standing;
        } else {
            throw new IllegalArgumentException("Over standing capacity");
        }

    }

    public int getStadium_size() {
        return stadium_size;
    }

    public void setStadium_size(int stadium_size) {
        if (stadium_size <= 100) {
            this.stadium_size = stadium_size;
        } else {
            throw new IllegalArgumentException("Stadium Full");
        }
    }

    public String getTicket_ref() {
        return ticket_ref;
    }

    public void setTicket_ref(String ticket_ref) {
        if(ticket_ref.toCharArray().length > 20 || ticket_ref.toCharArray().length < 20){
            throw new IllegalArgumentException("ERROR TICKET REFERENCE LENGTH DOESN'T MEET REQUIREMENTS");
        } else {
            this.ticket_ref = ticket_ref;
        }
    }




    @Override
    public String toString() {
        return "TicketAvailability{" +
                "user_seat=" + user_seat +
                ", user_standing=" + user_standing +
                ", stadium_size=" + stadium_size +
                '}';
    }
}