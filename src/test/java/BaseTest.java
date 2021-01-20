import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void  preSuite(){

        Configuration.startMaximized = true;
        Configuration.timeout = 10000;

    }
}
