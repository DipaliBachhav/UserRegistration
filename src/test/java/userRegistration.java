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
    public void FirstName_toShort_False(){
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateFirstName("Di");
        Assert.assertEquals(false,condition);
    }

    @Test
    public void FirstName_allSmall_False(){
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateFirstName("dipali");
        Assert.assertEquals(false,condition);
    }



    @Test
    public void LastName()
    {
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateLastName("Bachhav");
        Assert.assertEquals(true,condition);
    }

    @Test
    public void LastName_toShort_False(){
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateLastName("aa");
        Assert.assertEquals(false,condition);
    }

    @Test
    public void LastName_allSmall_False(){
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateLastName("bachhav");
        Assert.assertEquals(false,condition);
    }

    @Test
    public void EMail()
    {
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateEmail("dili@bl.com.in");
        Assert.assertEquals(true,condition);
    }

    @Test
    public void MobileNumber()
    {
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateMobileNo("919859745285");
        Assert.assertEquals(true,condition);
    }

}
