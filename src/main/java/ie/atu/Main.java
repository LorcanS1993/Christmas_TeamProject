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

            System.out.print("ENTER NAME (MUST BE GREATER THAN 2 LETTERS): ");
            ticket.setUsr_name(sc.nextLine());

            System.out.print("\nENTER OCCUPATION (INDIVIDUAL, STUDENT, FAMILY, ELDERLY): ");
            ticket.setUsr_occupation(sc.nextLine());

            System.out.print("\nENTER AGE (MUST BE OLDER THAN 16): ");
            ticket.setUsr_age(sc.nextInt());

            System.out.print("\nENTER CARD NUMBER: ");
            ticket.setUsr_card_num(sc.nextLong());


            System.out.print("DO YOU WANT SEATING OR STANDING TICKETS: ");
            String input = sc.nextLine();



            // consumes nextlong left-over
            // DO NOT REMOVE FROM CODE
            sc.nextLine();

            ticket.setUsr_ticket_num(generateString());
            System.out.print("\nTICKET REFERENCE: " + ticket.getUsr_ticket_num() + "\n");

            new_ticket.add(ticket);

            System.out.printf(new_ticket.toString());
        }
    }
}