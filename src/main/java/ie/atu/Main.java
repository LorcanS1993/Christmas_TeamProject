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
            System.out.println("\n==========================================================\n" + new_ticket.toString() + "\n==========================================================\n\r");

            System.out.println("ENTER NAME: ");
            String name = sc.nextLine();

            System.out.println("ENTER OCCUPATION: ");
            String occupation = sc.nextLine();

            System.out.println("ENTER AGE: ");
            int age = sc.nextInt();

            System.out.println("ENTER CARD NUMBER: ");
            long card_num = sc.nextLong();

            // consumes nextline left-over
            // DO NOT REMOVE FROM CODE
            sc.nextLine();

            String ticket_num = generateString();
            System.out.println("TICKET REFERENCE: " + ticket_num);

            new_ticket.add(new TicketInfo(name, occupation, age, card_num, ticket_num));


        }
    }
}