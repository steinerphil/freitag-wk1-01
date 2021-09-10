public class passwordValidatorJanOke {

    public static void main(String[] args){

        String password = "kwjgFöl";
        String[] passwordList = {"npasdDasddnpo","jhasdDasdadsdegio","kaoDenasdasdagop"};

        System.out.println(checkPasswordLength(password));
        System.out.println(checkPasswordContainsDigits(password));
        System.out.println(checkPasswordContainsUpperOrLowerChars(password));
        System.out.println(checkPasswordListLengthValid(passwordList));
        System.out.println(checkPasswordListContainsDigits(passwordList));
        System.out.println(checkPasswordListContainsUpperOrLowerChars(passwordList));

    }

    public static String checkPasswordLength(String password){

        int passwordLen = password.length();

        if (passwordLen < 8){

            return "Password is too short";

        }

        return "Password is valid";

    }

    public static boolean checkPasswordContainsDigits(String password){

        return password.matches(".*\\d.*");

    }

    public static boolean checkPasswordContainsUpperOrLowerChars(String password){

        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (int i = 0; i < password.length(); i++){

            char passwordChar = password.charAt(i);

            if (Character.isUpperCase(passwordChar))
                upperCaseCount++;
            if (Character.isLowerCase(passwordChar))
                lowerCaseCount++;

        }

        return (upperCaseCount > 0 && lowerCaseCount > 0);

    }

    public static String checkPasswordListLengthValid(String[] passwordList){

        for (int i = 0; i < passwordList.length; i++){

            int passwordLen = passwordList[i].length();

            if (passwordLen < 8){

                return "One or more of the passwords is too short";

            }

        }   return "Passwords are valid";

    }

    public static String checkPasswordListContainsDigits(String[] passwordList){

        int digitCount = 0;

        for (int i = 0; i < passwordList.length; i++){

            if (passwordList[i].matches(".*\\d.*")) {

                digitCount++;

            }

        }

        if (digitCount == 1 ) {

            return digitCount + " password contains digits.";

        } else if (digitCount > 1) {

            return digitCount + " passwords contain digits.";

        }

        return "no password contains digits.";

    }

    public static String checkPasswordListContainsUpperOrLowerChars(String[] passwordList){

        int upperAndLowerCaseCount = 0;
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (int i = 0; i < passwordList.length; i++){

            for (int y = 0; y < passwordList[i].length(); y++) {

                char passwordChar = passwordList[i].charAt(y);

                if (Character.isUpperCase(passwordChar))
                    upperCaseCount++;
                if (Character.isLowerCase(passwordChar))
                    lowerCaseCount++;

            }

            if (upperCaseCount > 0 && lowerCaseCount > 0)
                upperAndLowerCaseCount++;

            upperCaseCount = 0;
            lowerCaseCount = 0;

        }

        if (upperAndLowerCaseCount == 1 ) {

            return upperAndLowerCaseCount + " password contains lower and upper case letters.";

        } else if (upperAndLowerCaseCount > 1) {

            return upperAndLowerCaseCount + " passwords contain lower and upper case letters.";

        }

        return "no password contains lower and upper case letters.";

    }

}
