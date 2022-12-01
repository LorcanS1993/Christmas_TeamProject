package ie.atu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

import static ie.atu.GenerateValues.generateString;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<TicketInfo> new_ticket = new ArrayList<>();

        while(true){
            TicketInfo ticket = new TicketInfo();

            System.out.println("\n\n==========================================================\n==========================================================\n\r");

            System.out.print("ENTER NAME: ");
            ticket.setUsr_name(sc.nextLine());

            System.out.print("\nENTER OCCUPATION: ");
            ticket.setUsr_occupation(sc.nextLine());

            System.out.print("\nENTER AGE: ");
            ticket.setUsr_age(sc.nextInt());

            System.out.print("\nENTER CARD NUMBER: ");
            ticket.setUsr_card_num(sc.nextLong());

            // consumes nextlong left-over
            // DO NOT REMOVE FROM CODE
            sc.nextLine();

            ticket.setUsr_ticket_num(generateString());
            System.out.print("\nTICKET REFERENCE: " + ticket.getUsr_ticket_num());

            new_ticket.add(ticket);

            System.out.printf(new_ticket.toString());
        }
    }
}