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
    public void givenEmailId_whenProper_shouldReturnTrue()
    {
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateEmail("dili@bl.com.in");
        Assert.assertEquals(true,condition);
    }

    @Test
    public void givenMobileNumber_whenProper_shouldReturnTrue()
    {
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateMobileNo("919859745285");
        Assert.assertEquals(true,condition);
    }

    @Test
    public void givenMobileNumber_whenContainsSpecialSymbol_shouldReturnFalse()
    {
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateMobileNo("91&25134561");
        Assert.assertEquals(false,condition);
    }

    @Test
    public void givenMobileNumber_whenContainsCharacter_shouldReturnFalse()
    {
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validateMobileNo("912342Aa54");
        Assert.assertEquals(false,condition);
    }

    @Test
    public void givenPassword_whenProper_shouldReturnTrue()
    {
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validatePassword("dip@li1Abc");
        Assert.assertEquals(true,condition);
    }

    @Test
    public void givenPassword_whenNotContainsUpperCase_shouldReturnFalse()
    {
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validatePassword("dipali1@sd");
        Assert.assertEquals(false,condition);
    }

    @Test
    public void givenPassword_whenNotContainsSpecialSymbol_shouldReturnFalse()
    {
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validatePassword("Dipalis2d");
        Assert.assertEquals(false,condition);
    }

    @Test
    public void givenPassword_whenNotContainsNumericValue_shouldReturnFalse()
    {
        UserRegistrationMain registrationMain = new UserRegistrationMain();
        boolean condition = registrationMain.validatePassword("dipaliA@sd");
        Assert.assertEquals(false,condition);
    }




}
