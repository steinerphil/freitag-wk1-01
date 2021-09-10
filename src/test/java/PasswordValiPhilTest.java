import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValiPhilTest {

    @Test
    void validatePasswordArray() {

        // GIVEN
        boolean[] expected = {false, false, true};
        String[] passwordArray = {"password", "Password", "Password1"};
        //WHEN
        boolean[] actual = PasswordValiPhil.validatePasswordArray(passwordArray);
        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    void testValidatePassword() {
        // GIVEN
        String password = "Password1";
        //WHEN
        boolean actual = PasswordValiPhil.validatePassword(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkPasswordLength() {
        //GIVEN
        String password = "12345678";
        //WHEN
        boolean actual = PasswordValiPhil.checkPasswordLength(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkContainsDigit() {
        //GIVEN
        String password = "aaaaaaa1";
        //WHEN
        boolean actual = PasswordValiPhil.checkContainsDigit(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkLowerAndUpperCase() {
        //GIVEN
        String password = "Password";
        //WHEN
        boolean actual = PasswordValiPhil.checkLowerAndUpperCase(password);
        //THEN
        assertTrue(actual);
    }
}