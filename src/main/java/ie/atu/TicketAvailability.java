package ie.atu;

public class TicketAvailability {
    public int user_seat; // 70
    public int user_standing; //30
    public int stadium_size = 100;

    public TicketAvailability(int user_seat, int use, int stadium_size) {
        this.user_seat = user_seat;
        this.user_standing = use;
        this.stadium_size = stadium_size;
    }

    public int getUser_seat() {
        return user_seat;
    }

    public void setUser_seat(int user_seat) {

        if (String.valueOf(user_seat).length() <= 70) {
            this.user_seat = user_seat; }
        else {
            throw new IllegalArgumentException("Over seating capacity");
        }
    }

    public int getUser_standing() {
        return user_standing;
    }

    public void setUser_standing(int user_standing) {
        if (String.valueOf(user_standing).length() <= 30) {
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

    @Override
    public String toString() {
        return "TicketAvailability{" +
                "user_seat=" + user_seat +
                ", user_standing=" + user_standing +
                ", stadium_size=" + stadium_size +
                '}';
    }
}