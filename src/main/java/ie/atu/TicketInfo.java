package ie.atu;

import java.util.Random;

public class TicketInfo {

    //  usr input data
    private String usr_name;
    private String usr_occupation;
    private int usr_age;
    private long usr_card_num;

    //  output data
    private String usr_ticket_num;


    public TicketInfo(String usr_name, String usr_occupation, int usr_age, long usr_card_num, String usr_ticket_num){
        this.usr_name = usr_name;
        this.usr_occupation = usr_occupation;
        this.usr_age = usr_age;
        this.usr_card_num = usr_card_num;
        this.usr_ticket_num = usr_ticket_num;
    }

    public void setUsr_name(String usr_name) {
        this.usr_name = usr_name;
    }

    public void setUsr_occupation(String usr_occupation) {
        this.usr_occupation = usr_occupation;
    }

    public void setUsr_age(int usr_age) {
        this.usr_age = usr_age;
    }

    public void setUsr_card_num(long usr_card_num) {
        this.usr_card_num = usr_card_num;
    }

    public void setUsr_ticket_num(String ticket_num) {
        this.usr_ticket_num = ticket_num;
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
        return "ticketInfo{" +
                "usr_name='" + usr_name + '\'' +
                ", usr_occupation='" + usr_occupation + '\'' +
                ", usr_age=" + usr_age +
                ", usr_card_num='" + usr_card_num + '\'' +
                ", usr_ticket_num='" + usr_ticket_num + '\'' +
                '}';
    }
}
