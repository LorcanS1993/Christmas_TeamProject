package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInfoTest {

    UserInfo user_info;

    @BeforeEach
    void setUp() {
        user_info = new UserInfo("Joe", "student", 21);
    }

    @Test
    void setUsr_name() {
        assertEquals(3, user_info.getUsr_name().length());
    }

    @Test
    void setUsr_occupation() {
        String test = "student";
        assertArrayEquals(test.toCharArray(), user_info.getUsr_occupation().toCharArray());
    }

    @Test
    void setUsr_age() {
        assertEquals(21, user_info.getUsr_age());
    }
}