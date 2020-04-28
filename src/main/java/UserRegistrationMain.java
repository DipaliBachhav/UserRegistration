import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {

    public static boolean checkFirstName(String firstName) {
        Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher=pattern.matcher(firstName);
        return matcher.matches();
    }

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
}
