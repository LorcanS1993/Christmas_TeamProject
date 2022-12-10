package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketAvailabilityTest {

    TicketAvailability TickNum;

    @BeforeEach
    void setUp() {
        TickNum = new TicketAvailability(2,2);
    }

    @Test
    void setUser_seat() {
        TickNum.setUser_seat(1);
        assertEquals(1, TickNum.getUser_seat());
    }

    @Test
    void setUser_standing() {
        TickNum.setUser_standing(1);
        assertEquals(1, TickNum.getUser_standing());

    }

    @Test
    void SetSeat_kindSit(){
        String testString = "sit";

        TickNum.setSeat_kind("SIT");
        assertEquals(testString, TickNum.getSeat_kind());
    }
    @Test
    void SetSeat_kindStand(){
        String testString = "stand";

        TickNum.setSeat_kind("Stand");
        assertEquals(testString, TickNum.getSeat_kind());
    }

    @AfterEach
    void tearDown() {
    }
}