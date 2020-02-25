import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void passingTest(){
        System.out.println("this test will always pass!");
    }
    @Test
    public void secondtest(){
        System.out.println("never  test fail");
    }



}
