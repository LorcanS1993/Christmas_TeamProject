package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    Payment myCard;
    @BeforeEach
    void setUp() {
        myCard = new Payment(1234567890123456l, "01/23", 451);
    }



    @Test
    void getCardNumber() {
        
    }

    @Test
    void setCardNumber() {
        String buffer = Long.toString(myCard.getCardNumber());
        assertEquals(16, buffer.toCharArray().length);
    }

    @Test
    void getCardDate() {
    }

    @Test
    void setCardDate() {
        String buffer = myCard.getCardDate();
        assertEquals(5, buffer.toCharArray().length);
    }

    @Test
    void getCardCCV() {
    }

    @Test
    void setCardCCV() {
        String buffer = Integer.toString(myCard.getCardCCV());
        assertEquals(3, buffer.toCharArray().length);
    }

    @Test
    void getCardType() {
    }

    @AfterEach
    void tearDown() {
    }
}