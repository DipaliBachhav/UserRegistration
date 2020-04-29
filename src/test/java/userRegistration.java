import org.junit.Assert;
import org.junit.Test;


public class userRegistration {
    @Test
    public void givenFirstName_whenProper_shouldReturnTrue(){
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateFirstName("Dipali");
        Assert.assertEquals(true,condition);
    }

    @Test
    public void givenFirstName_whenToShort_shouldReturnFalse(){
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateFirstName("Di");
        Assert.assertEquals(false,condition);
    }

    @Test
    public void givenFirstName_whenSmall_shouldReturnFalse(){
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateFirstName("dipali");
        Assert.assertEquals(false,condition);
    }

    @Test
    public void givenLastName_whenProper_shouldReturnTrue()
    {
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateLastName("Bachhav");
        Assert.assertEquals(true,condition);
    }

    @Test
    public void givenLastName_whenToShort_shouldReturnFalse(){
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateLastName("aa");
        Assert.assertEquals(false,condition);
    }

    @Test
    public void givenLastName_whenSmall_shouldReturnFalse(){
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
