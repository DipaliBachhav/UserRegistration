
import java.util.regex.Pattern;

public class UserRegistrationMain {
    public boolean validateFirstName(String fName) {
        String pattern=("^[A-Z]{1}[a-z]{2,}");
        if(fName.matches(pattern))
        {
            return true;
        }
            return false;
    }

    public boolean validateLastName(String lName) {
        String pattern=("^[A-Z]{1}[a-z]{2,}");
        if(lName.matches(pattern))
        {
            return true;
        }
            return false;
    }

    public boolean validateEmail(String email) {
        String patternEmail=("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2})?$");
        if(email.matches(patternEmail))
        {
            return true;
        }
            return false;
    }

    public boolean validateMobileNo(String mobile) {
        String number="[1-9]{2}[0-9]{10}";
        if(mobile.matches(number))
        {
            return true;
        }
            return false;
    }
}

