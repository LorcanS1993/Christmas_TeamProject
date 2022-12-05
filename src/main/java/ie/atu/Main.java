package ie.atu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

import static ie.atu.GenerateValues.generateString;
import static ie.atu.TicketAvailability.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<TicketInfo> new_ticket = new ArrayList<>();

        while(true){
            TicketInfo ticket = new TicketInfo();

            System.out.println("\n\n==========================================================\nUSER INFO\n==========================================================\n\r");

            System.out.print("ENTER NAME (MUST BE GREATER THAN 2 LETTERS): ");
            ticket.setUsr_name(sc.nextLine());

            System.out.print("\nENTER OCCUPATION (INDIVIDUAL, STUDENT, FAMILY, ELDERLY): ");
            ticket.setUsr_occupation(sc.nextLine());

            System.out.print("\nENTER AGE (MUST BE OLDER THAN 16): ");
            ticket.setUsr_age(sc.nextInt());

            System.out.println("\n\n==========================================================\nPAYMENTS\n==========================================================\n\r");

            System.out.print("\nENTER CARD NUMBER: ");
            ticket.ticket_pay.setCardNumber(sc.nextLong());

            sc.nextLine();

            System.out.print("\nENTER CARD DATE: ");
            ticket.ticket_pay.setCardDate(sc.nextLine());

            System.out.print("\nENTER CARD CCV: ");
            ticket.ticket_pay.setCardCCV(sc.nextInt());


            // consumes nextlong left-over
            // DO NOT REMOVE FROM CODE
            sc.nextLine();


            //  referencces ticket_avail in ticket object and sets the ticket_ref with generated 20 digit string from GenerateValues class
            ticket.ticket_avail.setTicket_ref(generateString());
            System.out.print("\nTICKET REFERENCE: " + ticket.ticket_avail.getTicket_ref() + "\n");

            new_ticket.add(ticket);

            System.out.printf(new_ticket.toString());
        }
    }
}