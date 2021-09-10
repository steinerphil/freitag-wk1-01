import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPasswordValidatorJanOke {



    @Test
    public void testCheckPasswordLengthValid(){

        //GIVEN

        String password = "opjg341opjnpoaw";

        //WHEN

        String expected = "Password is valid";

        String actual = passwordValidatorJanOke.checkPasswordLength(password);

        //THEN

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCheckPasswordLengthNotValid(){

        //GIVEN

        String password = "opjg";

        //WHEN

        String expected = "Password is too short";

        String actual = passwordValidatorJanOke.checkPasswordLength(password);

        //THEN

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCheckPasswordContainsDigits(){

        // GIVEN

        String password = "123opasdjg";

        // WHEN

        boolean actual = passwordValidatorJanOke.checkPasswordContainsDigits(password);

        // THEN

        Assertions.assertTrue(actual);

    }

    @Test
    public void testCheckPasswordDoesntContainsDigits(){

        // GIVEN

        String password = "opasdjg";

        // WHEN

        boolean actual = passwordValidatorJanOke.checkPasswordContainsDigits(password);

        // THEN

        Assertions.assertFalse(actual);

    }

    @Test
    public void testCheckPasswordContainsUpperAndLowerChars(){

        // GIVEN

        String password = "opaGsDdjg";

        // WHEN

        boolean actual = passwordValidatorJanOke.checkPasswordContainsUpperOrLowerChars(password);

        // THEN

        Assertions.assertTrue(actual);

    }

    @Test
    public void testCheckPasswordDoesntContainsUpperAndLowerChars(){

        // GIVEN

        String password = "apügkwüp";

        // WHEN

        boolean actual = passwordValidatorJanOke.checkPasswordContainsUpperOrLowerChars(password);

        // THEN

        Assertions.assertFalse(actual);

    }

    @Test
    public void testCheckPasswordListContainsUpperAndLowerChars(){

        // GIVEN

        String password = "opaGsDdjg";

        // WHEN

        boolean actual = passwordValidatorJanOke.checkPasswordContainsUpperOrLowerChars(password);

        // THEN

        Assertions.assertTrue(actual);

    }

    @Test
    public void testCheckPasswordListDoesntContainsUpperAndLowerChars(){

        // GIVEN

        String password = "apügkwüp";

        // WHEN

        boolean actual = passwordValidatorJanOke.checkPasswordContainsUpperOrLowerChars(password);

        // THEN

        Assertions.assertFalse(actual);

    }

    @Test
    public void testCheckPasswordListContainsDigits(){

        // GIVEN

        String[] passwordList = {"np4asdasdnpo","jhasd4asdasdegio","kaoenasdasd4agop"};

        // WHEN

        String expected = passwordList.length + " passwords contain digits.";

        String actual = passwordValidatorJanOke.checkPasswordListContainsDigits(passwordList);

        // THEN

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCheckPasswordListContainsDigits1True(){

        // GIVEN

        String[] passwordList = {"npasdasdnpo","jhasdasdasdegio","kaoenasdasd4agop"};

        // WHEN

        String expected = "1 password contains digits.";

        String actual = passwordValidatorJanOke.checkPasswordListContainsDigits(passwordList);

        // THEN

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCheckPasswordListContainsDigitsNonTrue(){

        // GIVEN

        String[] passwordList = {"npasdasdnpo","jhasdasdasdegio","kaoenasdasdagop"};

        // WHEN

        String expected = "no password contains digits.";

        String actual = passwordValidatorJanOke.checkPasswordListContainsDigits(passwordList);

        // THEN

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCheckPasswordListContainsUpperOrLowerChars2True(){

        // GIVEN

        String[] passwordList = {"npasDdasdnpo","jhasdasddasdegio","kaDoenasdasdagop"};

        // WHEN

        String expected = "2 passwords contain lower and upper case letters.";

        String actual = passwordValidatorJanOke.checkPasswordListContainsUpperOrLowerChars(passwordList);

        // THEN

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testCheckPasswordListContainsUpperOrLowerCharsFalse(){

        // GIVEN

        String[] passwordList = {"npasdasdnpo","jhasdasddasdegio","kaoenasdasdagop"};

        // WHEN

        String expected = "no password contains lower and upper case letters.";

        String actual = passwordValidatorJanOke.checkPasswordListContainsUpperOrLowerChars(passwordList);

        // THEN

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCheckPasswordListContainsUpperOrLowerChars3True(){

        // GIVEN

        String[] passwordList = {"npaDsdasdnpo","jhasdasDddasdegio","kaoenaDsdasdagop"};

        // WHEN

        String expected = "3 passwords contain lower and upper case letters.";

        String actual = passwordValidatorJanOke.checkPasswordListContainsUpperOrLowerChars(passwordList);

        // THEN

        Assertions.assertEquals(expected, actual);

    }

}
