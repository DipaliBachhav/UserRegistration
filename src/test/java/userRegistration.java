import org.junit.Assert;
import org.junit.Test;


public class userRegistration {
    @Test
    public void FirstName(){
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateFirstName("Dipali");
        Assert.assertEquals(true,condition);
    }

    @Test
    public void LastName()
    {
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateLastName("Bachhav");
        Assert.assertEquals(true,condition);
    }

    @Test
    public void EMail()
    {
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateEmail("diapli@bl.com.in");
        Assert.assertEquals(true,condition);
    }

}
