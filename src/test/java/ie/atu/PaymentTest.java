package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
Payment myCard;
    @BeforeEach
    void setUp() {
        myCard = new Payment();
        myCard.cardNumber = "123456789123";
        myCard.cardDate = "01/23";
        myCard.cardCCV = "000";
    }
    @Test
    void testCardNumberLength()
    {
        assert myCard.cardNumber.length() == 12 : "Card number is invalid";
       // assertEquals(3, myCard.cardCCV.length());
    }
    @Test
    void testCardDateLength()
    {
        assert myCard.cardDate.length() == 5 : "Card Date is invalid";
       // assertEquals(3, myCard.cardCCV.length());
    }
    @Test
    void testCardCCVLength()
    {
       assert myCard.cardCCV.length() == 3 : "Card CCV is invalid";
       // assertEquals(3, myCard.cardCCV.length());
    }

    @AfterEach
    void tearDown() {
    }
}