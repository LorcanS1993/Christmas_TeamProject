package ie.atu;

public class TicketInfo {

    //  classes
    TicketAvailability ticket_avail = new TicketAvailability();
    Payment ticket_pay = new Payment();


    //  usr input data
    private String usr_name;
    private String usr_occupation;
    private int usr_age;

    //  remove and be replaced with other branch
    private long usr_card_num;

    //  remove and be replaced with other branch
    private String usr_ticket_num;

    public TicketInfo(){

    }

    //  debug purposes, do not create object using this constructor
    public TicketInfo(String usr_name, String usr_occupation, int usr_age, long usr_card_num, String usr_ticket_num){
        this.usr_name = usr_name;
        this.usr_occupation = usr_occupation;
        this.usr_age = usr_age;
        this.usr_card_num = usr_card_num;
        this.usr_ticket_num = usr_ticket_num;
    }

    public void setUsr_name(String usr_name) {
        if(usr_name.toCharArray().length >= 3){
            this.usr_name = usr_name;
        } else {
            throw new IllegalArgumentException("Name too short, must be more than 2 letters");
        }
    }

    public void setUsr_occupation(String usr_occupation) {
        switch (usr_occupation){
            case "Student":
            case "STUDENT":
            case "student": this.usr_occupation = "student";
            break;
            case "Elderly":
            case "ELDERLY":
            case "elderly": this.usr_occupation = "elderly";
            break;
            case "Family":
            case "FAMILY":
            case "family":  this.usr_occupation = "family";
            case "Individual":
            case "INDIVIDUAL":
            case "individual": this.usr_occupation = "individual";
            break;
            default:    throw new IllegalArgumentException("Wrong input please try again");
        }
    }

    public void setUsr_age(int usr_age) {
        if(usr_age > 16){
            this.usr_age = usr_age;
        } else {
            throw new IllegalArgumentException("Below age to purchase ticket without permission");
        }

    }


    public String getUsr_name() {
        return usr_name;
    }

    public String getUsr_occupation() {
        return usr_occupation;
    }

    public int getUsr_age() {
        return usr_age;
    }

    public long getUsr_card_num() {
        return usr_card_num;
    }

    public String getUsr_ticket_num() {
        return usr_ticket_num;
    }


    @Override
    public String toString() {
        return "TicketInfo{" +
                "usr_name='" + usr_name + '\'' +
                ", usr_occupation='" + usr_occupation + '\'' +
                ", usr_age=" + usr_age +
                ", usr_card_num=" + ticket_pay.getCardNumber() +
                ", usr_card_type='" + ticket_pay.getCardType() + '\'' +
                ", usr_card_date='" + ticket_pay.getCardDate() + '\'' +
                ", usr_card_ccv='" + ticket_pay.getCardCCV() + '\'' +
                ", usr_ticket_num='" + ticket_avail.getTicket_ref() + '\'' +
                '}';
    }
}
