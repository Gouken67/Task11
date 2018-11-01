import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void checkGetLocalNumber(){
        Assert.assertTrue("The local number isn't equal to 14", this.getLocalNumber() == 14);
    }
}
