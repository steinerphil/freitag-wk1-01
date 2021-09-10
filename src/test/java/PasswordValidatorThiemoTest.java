import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorThiemoTest {

    // ??? Global String inputFieldForAllinTestClass = "DiesIstEin2-3-SicheresPasswort";
    // ??? int lengthDefinitionForAllinTestClass = 12;

    // Tests for Task 1
    @Test
    public void testGreaterMinLength(){

        // GIVEN
        String inputField = "DiesIstEin2-3-SicheresPasswort";
        int lengthDefinition = 12;

        // WHEN
        boolean testResult = PasswordValidatorThiemo.checkRequiredLength(inputField, lengthDefinition);

        // THEN
        Assertions.assertTrue(testResult);

    }

    @Test
    public void testEqualsMinLength(){

        // GIVEN
        String inputField = "321";
        int lengthDefinition = 3;

        // WHEN
        boolean testResult = PasswordValidatorThiemo.checkRequiredLength(inputField, lengthDefinition);

        // THEN
        Assertions.assertTrue(testResult);

    }

    @Test
    public void testSmallerMinLength(){

        // GIVEN
        String inputField = "21";
        int lengthDefinition = 3;

        // WHEN
        boolean testResult = PasswordValidatorThiemo.checkRequiredLength(inputField, lengthDefinition);

        // THEN
        Assertions.assertFalse(testResult);

    }

    // Tests for Task 2
    @Test
    public void testPasswordHasNumber(){
        // GIVEN
        String inputField = "DiesIstEin2-3-SicheresPasswort";
        boolean hasNumber;
        //int lengthDefinition = 12;

        // WHEN
        boolean testResult = PasswordValidatorThiemo.checkIfPasswordContainsNumbers(inputField);

        // THEN
        Assertions.assertTrue(testResult);

    }

    @Test
    public void testPasswordHasNotNumber(){
        // GIVEN
        String inputField = "DiesIstEin-SicheresPasswort";
        boolean hasNumber;
        //int lengthDefinition = 12;

        // WHEN
        boolean testResult = PasswordValidatorThiemo.checkIfPasswordContainsNumbers(inputField);

        // THEN
        Assertions.assertFalse(testResult);

    }

}

