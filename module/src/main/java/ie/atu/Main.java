package ie.atu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        List<TicketInfo> new_ticket = new ArrayList<>();

        while(true){
            System.out.println("ENTER NAME: ");
            String name = sc.nextLine();

            System.out.println("ENTER OCCUPATION: ");
            String occupation = sc.nextLine();

            System.out.println("ENTER AGE: ");
            int age = sc.nextInt();

            System.out.println("ENTER CARD NUMBER: ");
            String card_num = sc.nextLine();

            //  ref_num is used for generating a ticket reference number
            //  for loop works but no error correction used. ref num varies in size
            String ref_num = "";
            for(int i = 0; i < 40; i++){
                char buffer = (char) (rand.nextInt(73) + '1');
                if(buffer > '1' && buffer < '9' || buffer > 'a' && buffer < 'z'){
                    ref_num += buffer;
                } else {
                    i=i;
                    buffer = (char) (rand.nextInt(73) + '1');
                }
            }

            System.out.println("TICKET REFERENCE: " + ref_num);

            new_ticket.add(new TicketInfo(name, occupation, age, card_num, ref_num));

            System.out.println("\n==========================================================\n" + new_ticket.toString() + "\n==========================================================\n");
        }
    }

    void Inputdata(){

    }

}