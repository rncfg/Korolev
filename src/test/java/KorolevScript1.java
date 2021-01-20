import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.io.FileWriter;

import static com.codeborne.selenide.Selenide.*;


public class KorolevScript1 {

    @Test (invocationCount = 2)
    public void KorolevScript1() throws Exception
    {


        FileWriter fw = new FileWriter("mnemonic.txt", true);
        FileWriter fw2 = new FileWriter("address.txt", true);
        //BufferedWriter bw = new BufferedWriter(fw);
        //BufferedWriter bw2 = new BufferedWriter(fw2);
        //PrintWriter out = new PrintWriter(bw);

        open("https://iancoleman.io/bip39/");
        $(By.xpath("/html/body/div[1]/div[1]/div/form/div[2]/div/div/div/select")).selectOptionByValue("12");
        $(By.xpath("/html/body/div[1]/div[1]/div/form/div[2]/div/div/div/button")).click();
        $(By.xpath("/html/body/div[1]/div[3]/div[5]/div[1]/div/table/thead/tr/th[1]/div/button")).click();
        $(By.xpath("/html/body/div[1]/div[3]/div[5]/div[1]/div/table/thead/tr/th[3]/div/button")).click();
        String text1 = $(By.xpath("/html/body/div[1]/div[1]/div/form/div[7]/div/textarea")).getValue();
        fw.write(text1);
        fw.close();
        String text2 = $(By.xpath("/html/body/div[1]/div[3]/div[5]/div[1]/div/table/tbody/tr[1]/td[2]")).getText();
        fw2.write(text2);
        fw2.close();

    }

}