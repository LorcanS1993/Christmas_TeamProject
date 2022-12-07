package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketInfoTest {
    TicketInfo my_ticket_info;

    @BeforeEach
    void setUp() {
        my_ticket_info = new TicketInfo("Joe", "student", 21, 4319123456789101l, "1234abcd5678efgh90ij");
    }

    @Test
    void setUsr_name() {
        assertEquals(3, my_ticket_info.getUsr_name().length());
    }

    @Test
    void setUsr_occupation() {
        String test = "student";
        assertArrayEquals(test.toCharArray(), my_ticket_info.getUsr_occupation().toCharArray());
    }

    @Test
    void setUsr_age() {
        assertEquals(21, my_ticket_info.getUsr_age());
    }

    @Test
    void setUsr_card_num() {
        assertEquals(4319123456789101l, my_ticket_info.getUsr_card_num());
    }

    @Test
    void setUsr_ticket_num() {
        assertEquals(20, my_ticket_info.getUsr_ticket_num().length());
    }

    @AfterEach
    void tearDown() {
    }

}