
import java.util.regex.Pattern;

public class UserRegistrationMain {
    public boolean validateFirstName(String fName) {
        String pattern=("^[A-Z]{1}[a-z]{2,}");
        if(fName.matches(pattern))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public boolean validateLastName(String lName) {
        String pattern=("^[A-Z]{1}[a-z]{2,}");
        if(lName.matches(pattern))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    }

