package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class ParkingAvailabilityTest {
    ParkingAvailability ParkingNo;
    @BeforeEach
    void setUp() {
        ParkingNo = new ParkingAvailability(1);
        //ParkingNo.setNoOfParkSpaces(100);
    }
    @Test
    void testParkingAvailability(){
        assertEquals(0, ParkingNo.getUser_Parking());
    }
    @AfterEach
    void tearDown() {
    }
}