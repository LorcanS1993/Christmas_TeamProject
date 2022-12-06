package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketAvailabilityTest {

    TicketAvailability TickNum;

    @BeforeEach
    void setUp() {
        TickNum = new TicketAvailability(1,1);
        TickNum.setStadium_size(100);
    }

    @Test
    void getUser_seat() {
    }

    @Test
    void setUser_seat() {
        String buffer = Long.toString(TickNum.getUser_seat());
        assertEquals(1, buffer.toCharArray(). length);
    }

    @Test
    void getUser_standing() {
    }

    @Test
    void setUser_standing() {
        String buffer = Long.toString(TickNum.getUser_standing());
        assertEquals(1, buffer.toCharArray(). length);

    }

    @Test
    void getStadium_size() {
    }

    @Test
    void setStadium_size() {
        String buffer = Long.toString(TickNum.getStadium_size());
        assertEquals(3, buffer.toCharArray(). length);
    }

    @AfterEach
    void tearDown() {
    }
}