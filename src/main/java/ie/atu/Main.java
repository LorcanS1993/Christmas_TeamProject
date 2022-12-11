package ie.atu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static ie.atu.GenerateValues.generateString;

@RestController
@SpringBootApplication
@RequestMapping(path = "api/ticket")
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

        /*
        //List<TicketInfo> new_ticket = new ArrayList<>();
        TicketAvailability max_tickets = new TicketAvailability(1, 10);

        List<TicketInfo> new_ticket = List.of(
                //new TicketInfo("Joe", "student", 24, 4123456789012345l)
                //new TicketInfo()
        );


        /*
        while(true){
            TicketInfo ticket = new TicketInfo();

            System.out.println("\n\n==========================================================\nUSER INFO\n==========================================================\n\r");

            System.out.print("ENTER NAME (MUST BE GREATER THAN 2 LETTERS): ");
            ticket.setUsr_name(sc.nextLine());

            System.out.print("\nENTER OCCUPATION (INDIVIDUAL, STUDENT, FAMILY, ELDERLY): ");
            ticket.setUsr_occupation(sc.nextLine());

            System.out.print("\nENTER AGE (MUST BE OLDER THAN 16): ");
            ticket.setUsr_age(sc.nextInt());

            sc.nextLine();


            System.out.println("\n\n==========================================================\nSEATING\n==========================================================\n\r");

            System.out.print("SEATING OR STANDING ARRANGEMENTS: ");
            String buffer = sc.nextLine();

            ticket.ticket_avail.setSeat_kind(buffer);


            System.out.println("\n\n==========================================================\nPAYMENTS\n==========================================================\n\r");

            System.out.print("\nENTER CARD NUMBER: ");
            ticket.ticket_pay.setCardNumber(sc.nextLong());

            // consumes nextlong left-over
            // DO NOT REMOVE FROM CODE
            sc.nextLine();

            System.out.print("\nENTER CARD DATE (MM/YY): ");
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
         */
    }

    /*
    @GetMapping
    public String getTicketInfo(){
        List<TicketInfo> tickets = List.of(
                new TicketInfo("Morgan", "student", 23, "stand", "no", 4123456789012345l, "12/24", 451),
                new TicketInfo("Joe", "Individual", 28, "sit", "Yes", 5123456789012345l, "11/23", 557),
                new TicketInfo("joy", "FAMILY", 32, "stand", "YES", 6123456789012345l, "06/25", 332)
        );
        return tickets.toString();
    }

     */

    @GetMapping
    public String tickets(){
        List<TicketInfo> tickets = List.of(
                new TicketInfo("Morgan", "student", 23, "stand", "no", 4123456789012345l, "12/24", 451),
                new TicketInfo("Joe", "Individual", 28, "sit", "Yes", 5123456789012345l, "11/23", 557),
                new TicketInfo("joy", "FAMILY", 32, "stand", "YES", 6123456789012345l, "06/25", 332)
        );

        return tickets.toString();
    }
}